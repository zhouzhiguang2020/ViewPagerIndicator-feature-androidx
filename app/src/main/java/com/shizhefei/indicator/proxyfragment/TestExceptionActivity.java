package com.shizhefei.indicator.proxyfragment;

import android.os.Bundle;
import android.view.View;

import com.shizhefei.indicator.demo.R;

import androidx.fragment.app.FragmentActivity;

public class TestExceptionActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_exception);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                "".substring(1000);
            }
        });
    }
}

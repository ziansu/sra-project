@java.lang.Override
public void onClick(android.view.View v) {
    if (mLogAccelerometerData) {
        mAccelerometerToggleButton.setText(R.string.start_accel_data);
        mLogAccelerometerData = false;
    }else {
        mAccelerometerToggleButton.setText(R.string.stop_accel_data);
        mLogAccelerometerData = true;
    }
}
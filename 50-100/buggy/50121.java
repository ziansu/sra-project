@android.annotation.TargetApi(value = Build.VERSION_CODES.JELLY_BEAN)
@java.lang.Override
protected void onResume() {
    super.onResume();
    mSensorManager.registerListener(this, mAccelerometer, SensorManager.SENSOR_DELAY_GAME);
    isAYOActive = false;
    android.widget.TextView tv = ((android.widget.TextView) (findViewById(R.id.accelerometer_values)));
    tv.setText("");
    currRecordInd = 0;
    accel_count = 0;
    cycle = false;
    idle_count = 0;
    accel_data = new float[MAX_RECORDS];
}
@java.lang.Override
protected void onResume() {
    super.onResume();
    if (null != (mSensorManager)) {
        mSensorManager.registerListener(mShakeWatcher, mSensor, SensorManager.SENSOR_DELAY_NORMAL);
    }
}
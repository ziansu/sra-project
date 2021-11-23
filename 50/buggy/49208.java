@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((mSensorManager) != null) {
        mSensorManager.registerListener(mShakeWatcher, mSensor, SensorManager.SENSOR_DELAY_NORMAL);
    }
}
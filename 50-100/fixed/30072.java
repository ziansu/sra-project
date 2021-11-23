public boolean startOrienting() {
    boolean result = false;
    if ((mGravitySensor) != null) {
        mSensorManager.registerListener(this, mGravitySensor, SensorManager.SENSOR_DELAY_NORMAL);
        result = true;
    }
    if ((mTemperatureSensor) != null) {
        mSensorManager.registerListener(this, mTemperatureSensor, SensorManager.SENSOR_DELAY_NORMAL);
        result = true;
    }
    if ((mHumiditySensor) != null) {
        mSensorManager.registerListener(this, mHumiditySensor, SensorManager.SENSOR_DELAY_NORMAL);
        result = true;
    }
    return result;
}
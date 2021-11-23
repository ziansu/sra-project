@java.lang.Override
public void onBufferFull(java.lang.String[] timestamps, float[] values) {
    client.sendSensorData(SharedConstants.SENSOR_TYPE.ACCELEROMETER_WEARABLE, timestamps.clone(), values.clone());
}
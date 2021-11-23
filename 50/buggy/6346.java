@java.lang.Override
public void onResume() {
    super.onResume();
    sensorManager.registerListener(this, accelerometer, SensorManager.SENSOR_DELAY_NORMAL);
    sensorManager.registerListener(this, magneticField, SensorManager.SENSOR_DELAY_NORMAL);
}
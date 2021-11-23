@java.lang.Override
public void onClick(android.view.View v) {
    time = java.lang.System.currentTimeMillis();
    mSensorManager.registerListener(this, mAccelerometerSensor, SensorManager.SENSOR_DELAY_GAME);
    mSensorManager.registerListener(this, mGyroscopeSensor, SensorManager.SENSOR_DELAY_GAME);
}
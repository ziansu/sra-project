@java.lang.Override
public void onStop() {
    super.onStop();
    wl.release();
    sensorManager.unregisterListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER));
}
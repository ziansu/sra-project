@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
    if ((sensorEvent.sensor.getType()) == (android.hardware.Sensor.TYPE_ACCELEROMETER)) {
        xAccel = sensorEvent.values[0];
        updatePlane();
    }
}
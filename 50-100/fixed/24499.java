@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent event) {
    if ((event.sensor.getType()) == (android.hardware.Sensor.TYPE_ACCELEROMETER)) {
        gravity = event.values.clone();
        float x = gravity[0];
        float y = gravity[1];
        float z = gravity[2];
        setAccX(x);
    }
}
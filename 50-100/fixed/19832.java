@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent event) {
    if ((event.sensor.getType()) == (android.hardware.Sensor.TYPE_ACCELEROMETER)) {
        io.github.kajdreef.smartphonesensing.Sensor.Accelerometer.gravity[0] = event.values[0];
        io.github.kajdreef.smartphonesensing.Sensor.Accelerometer.gravity[1] = event.values[1];
        io.github.kajdreef.smartphonesensing.Sensor.Accelerometer.gravity[2] = event.values[2];
        this.notifyObserver(Sensor.TYPE_ACCELEROMETER);
    }
}
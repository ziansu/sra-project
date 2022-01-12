@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent event) {
    if ((event.sensor.getType()) == (android.hardware.Sensor.TYPE_MAGNETIC_FIELD)) {
        io.github.kajdreef.smartphonesensing.Sensor.Magnetometer.geomagnetic[0] = event.values[0];
        io.github.kajdreef.smartphonesensing.Sensor.Magnetometer.geomagnetic[1] = event.values[1];
        io.github.kajdreef.smartphonesensing.Sensor.Magnetometer.geomagnetic[2] = event.values[2];
        this.notifyObserver(Sensor.TYPE_MAGNETIC_FIELD);
    }
}
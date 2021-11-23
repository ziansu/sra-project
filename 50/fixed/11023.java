@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent event) {
    data = event.values;
    if ((event.sensor.getType()) == 1) {
    }
}
@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent event) {
    counter += event.values[0];
}
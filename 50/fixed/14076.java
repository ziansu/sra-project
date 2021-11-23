@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent event) {
    currentAcceleration = event.values[1];
}
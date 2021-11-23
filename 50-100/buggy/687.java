@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent event) {
    float x = event.values[0];
    float y = event.values[1];
    float z = event.values[2];
    acc = java.lang.Math.sqrt((((x * x) + (y * y)) + (z * z)));
    tv1.setText(("Acceleration: " + (acc)));
    if ((acc) < 20) {
        accidentAlert();
    }
}
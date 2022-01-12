@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent event) {
    data = event.values;
    if ((event.sensor.getType()) == 1) {
        android.util.Log.d("kuuntelija", ("voi ei!" + (randomi)));
    }
}
@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent event) {
    if ((event.sensor.getType()) == (android.hardware.Sensor.TYPE_ACCELEROMETER)) {
        gravity = event.values.clone();
        float x = gravity[0];
        float y = gravity[1];
        float z = gravity[2];
        android.util.Log.v(org.livewallpaper.GameService.GameEngine.class.getSimpleName(), java.lang.String.format("onSensorChanged: x: %f, y: %f, z: %f", x, y, z));
        setAccX(x);
    }
}
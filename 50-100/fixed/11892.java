@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent event) {
    if ((spaceShip) == null)
        return ;
    
    if ((event.sensor.getType()) == (android.hardware.Sensor.TYPE_ACCELEROMETER)) {
        float rawX = event.values[0];
        float normalizedX = rawX * (-2.0F);
        spaceShip.setXVelocity(((int) (normalizedX)));
    }
}
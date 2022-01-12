@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent event) {
    if ((event.sensor.getType()) == (android.hardware.Sensor.TYPE_LINEAR_ACCELERATION))
        filterLinAccValues(event);
    
}
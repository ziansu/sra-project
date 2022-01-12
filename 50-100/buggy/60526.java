@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent event) {
    if ((event.sensor.getType()) == (android.hardware.Sensor.TYPE_ACCELEROMETER)) {
        synchronized(accelerometerBuffer) {
            accelerometerBuffer.addReading(java.lang.String.valueOf(event.timestamp), event.values);
        }
    }else
        if ((event.sensor.getType()) == (android.hardware.Sensor.TYPE_GYROSCOPE)) {
            synchronized(gyroscopeBuffer) {
                gyroscopeBuffer.addReading(java.lang.String.valueOf(event.timestamp), event.values);
            }
        }else {
            android.util.Log.w(edu.umass.cs.prepare.SensorService.TAG, "Sensor Not Supported!");
        }
    
}
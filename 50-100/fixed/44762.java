public synchronized uk.ac.kent.eda.jb956.sensorlibrary.sensor.AudioSensorManager stopSensing() {
    if (!(isSensing()))
        return this;
    
    logInfo(TAG, "Stopped Audio Sensing");
    stopSensingTask();
    dutyCyclingManager.stop();
    sensing = false;
    uk.ac.kent.eda.jb956.sensorlibrary.SensorManager.getInstance(context).stopSensor(SensorUtils.SENSOR_TYPE_MICROPHONE);
    getSensorEvent().onSensingStopped(SensorUtils.SENSOR_TYPE_MICROPHONE);
    return this;
}
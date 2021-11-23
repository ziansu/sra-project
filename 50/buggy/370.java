public void start() {
    com.senior.g40.drivesafe.engines.CrashingSensorEngines.sensorManager.registerListener(this, com.senior.g40.drivesafe.engines.CrashingSensorEngines.accSensor, SensorManager.SENSOR_DELAY_UI);
    com.senior.g40.drivesafe.engines.CrashingSensorEngines.accLocationUtils.startLocationUpdate();
}
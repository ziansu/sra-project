public void testRetry() {
    com.google.android.apps.forscience.whistlepunk.sensorapi.ManualSensor sensor = new com.google.android.apps.forscience.whistlepunk.sensorapi.ManualSensor("sensorId", 100, 100);
    getSensorRegistry().addBuiltInSensor(sensor);
    com.google.android.apps.forscience.whistlepunk.SensorCardPresenter scp = createSCP();
    setSensorId(scp, "sensorId", "Sensor Name");
    scp.startObserving(sensor, sensor.createPresenter(null, null, null), null, null);
    sensor.simulateExternalEventPreventingObservation();
    assertFalse(sensor.isObserving());
    scp.retryConnection(context);
    assertTrue(sensor.isObserving());
}
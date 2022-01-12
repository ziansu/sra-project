private java.util.List<org.digitalpanda.backend.data.SensorMeasures> fetchAndDisplayMeasuresFromSensor() throws java.io.IOException {
    org.digitalpanda.iot.raspberrypi.sensor.SensorData tphSensorData = this.sensorTPH.fetchAndComputeValues();
    java.lang.System.out.println((">," + (tphSensorData.csvData())));
    return org.digitalpanda.iot.raspberrypi.sensor.utils.SensorDataMapper.create(tphSensorData, configuration.getValue(ConfigurationKey.SENSOR_LOCATION));
}
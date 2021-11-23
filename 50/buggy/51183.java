public void addSensorToList(java.lang.String path) throws java.io.IOException {
    com.corvolution.cm2.ConnectionManager.sensorPath = path;
    com.corvolution.cm2.Sensor sensor = new com.corvolution.cm2.Sensor(path);
    fireSensorEvent();
    com.corvolution.cm2.ConnectionManager.sensorList.add(sensor);
}
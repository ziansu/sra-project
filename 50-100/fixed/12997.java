@java.lang.Override
public java.util.List<com.bubblewrap.plants.webserver.model.Sensor> getCurrentSensorValues() {
    java.util.List<com.bubblewrap.plants.webserver.model.Sensor> result = new java.util.ArrayList<com.bubblewrap.plants.webserver.model.Sensor>();
    java.util.List<com.bubblewrap.plants.webserver.model.Sensor> sensors = jdbcTemplate.query(retrieveSensors, new com.bubblewrap.plants.webserver.jdbc.SensorRowMapper());
    for (com.bubblewrap.plants.webserver.model.Sensor sensor : sensors) {
        java.lang.String latestDataQuery = java.lang.String.format(retrieveLatestSensorData, sensor.getId());
        sensor.setData(jdbcTemplate.query(latestDataQuery, new com.bubblewrap.plants.webserver.jdbc.SensorDataRowMapper()));
        result.add(sensor);
    }
    return result;
}
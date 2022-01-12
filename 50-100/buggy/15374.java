public void parse(com.vaisala.cdb.reader.model.Sensor sensor, java.lang.String data) {
    java.util.StringTokenizer st = new java.util.StringTokenizer(data, " ");
    if ((st.countTokens()) != 2)
        throw new java.util.NoSuchElementException(com.vaisala.cdb.reader.state.SensorState.SENSOR_RANDOM_TIME_ERROR_CORRUPT_MSG);
    
    sensor.setRandomTimeError(st.nextToken());
}
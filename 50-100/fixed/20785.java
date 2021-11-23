private boolean initDB() {
    boolean status;
    synchronized(dbLock) {
        influxDB = org.influxdb.InfluxDBFactory.connect(connection, user, passwd);
        influxDB.setLogLevel(InfluxDB.LogLevel.FULL);
        status = ping(net.InfluxDBUtil.Impl.InfluxDBClientImpl.PING_INIT_RETRY_TIMES);
        if (status) {
            influxDB.createDatabase(dbName);
        }else {
            net.InfluxDBUtil.Impl.InfluxDBClientImpl.logger.info("initDB failed");
        }
        connectionStatus = status;
    }
    return status;
}
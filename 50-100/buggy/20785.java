private boolean initDB() {
    synchronized(dbLock) {
        influxDB = org.influxdb.InfluxDBFactory.connect(connection, user, passwd);
        influxDB.setLogLevel(InfluxDB.LogLevel.FULL);
        connectionStatus = ping(net.InfluxDBUtil.Impl.InfluxDBClientImpl.PING_INIT_RETRY_TIMES);
        if (connectionStatus) {
            influxDB.deleteDatabase(dbName);
            try {
                java.lang.Thread.sleep(1000);
            } catch (java.lang.InterruptedException ie) {
            }
            influxDB.createDatabase(dbName);
        }else {
            net.InfluxDBUtil.Impl.InfluxDBClientImpl.logger.info("initDB failed");
        }
    }
    return connectionStatus;
}
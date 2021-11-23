protected boolean updateConnectionStatus() {
    synchronized(dbLock) {
        connectionStatus = ping(net.InfluxDBUtil.Impl.InfluxDBClientImpl.PING_INIT_RETRY_TIMES);
    }
    return connectionStatus;
}
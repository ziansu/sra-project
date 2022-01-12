@java.lang.Override
public void stop() {
    if (com.emc.storageos.db.server.impl.DbServiceImpl._log.isInfoEnabled()) {
        com.emc.storageos.db.server.impl.DbServiceImpl._log.info("Stopping DB service...");
    }
    if ((_gcExecutor) != null) {
        _gcExecutor.stop();
    }
    _exe.shutdownNow();
    if ((_jmxServer) != null) {
        _jmxServer.stop();
    }
    if (com.emc.storageos.db.server.impl.DbServiceImpl._log.isInfoEnabled()) {
        com.emc.storageos.db.server.impl.DbServiceImpl._log.info("DB service stopped...");
    }
}
@java.lang.Override
public void connect() throws org.eclipse.kura.KuraConnectException {
    stopConnectionMonitorTask();
    if ((this.dbService) == null) {
        throw new org.eclipse.kura.KuraConnectException("H2DbService instance not attached, not connecting");
    }
    if (!(this.dataTransportService.isConnected())) {
        this.dataTransportService.connect();
    }
}
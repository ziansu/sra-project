@java.lang.Override
public void close() {
    closeRestApiClient();
    getReportingConnection().disconnect();
    getSchedulerConnection().disconnect();
}
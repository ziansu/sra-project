@java.lang.Override
public void close() {
    super.close();
    getReportingConnection().disconnect();
    getSchedulerConnection().disconnect();
}
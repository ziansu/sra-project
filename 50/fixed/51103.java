@java.lang.Override
public void initialize(boolean createTraceObject) {
    if (createTraceObject) {
        getTraceContext().newTraceObject();
    }
    getRecorder().clear();
    getTestTcpDataSender().clear();
    ignoredServiceTypes.clear();
}
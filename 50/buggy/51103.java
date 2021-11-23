@java.lang.Override
public void initialize(boolean createTraceObject) {
    if (createTraceObject) {
        com.navercorp.pinpoint.bootstrap.context.Trace trace = getTraceContext().newTraceObject();
    }
    getRecorder().clear();
    getTestTcpDataSender().clear();
    ignoredServiceTypes.clear();
}
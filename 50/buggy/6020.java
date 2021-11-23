@java.lang.Override
public void run() {
    com.linkedin.pinot.core.trace.TraceContext.registerThreadToRequest(request, parent);
    try {
        runJob();
    } finally {
        com.linkedin.pinot.core.trace.TraceContext.unregisterThreadFromRequest();
    }
}
@java.lang.Override
public com.kepler.protocol.Request process(com.kepler.protocol.Request request) {
    if (log4jSupported) {
        com.kepler.header.Headers headers = request.headers();
        if (headers != null) {
            java.lang.String trace = headers.get(Trace.TRACE, "");
            org.apache.log4j.MDC.put(Trace.TRACE, trace);
        }
    }
    return request;
}
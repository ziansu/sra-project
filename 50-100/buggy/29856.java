public static java.lang.String processTrace(java.lang.String serverName, java.lang.String[] traces, boolean abridged) {
    com.palantir.util.debug.StackTraceUtils.StackTraceBuilder stackTraceBuilder = new com.palantir.util.debug.StackTraceUtils.StackTraceBuilder(serverName, abridged);
    if (traces == null) {
        stackTraceBuilder.getStackTraceForNoIncorporatedTraces();
    }
    java.util.Arrays.sort(traces, new com.palantir.util.debug.StackTraceUtils.StackTraceComparator());
    for (java.lang.String trace : traces) {
        stackTraceBuilder.incorporateTrace(trace);
    }
    return stackTraceBuilder.getResultStackTrace();
}
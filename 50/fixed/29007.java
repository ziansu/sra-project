public static void endDuration(java.lang.String fileName) {
    org.voltdb.utils.VoltTrace.s_tracer.queueEvent(new org.voltdb.utils.VoltTrace.TraceEvent(fileName, org.voltdb.utils.VoltTrace.TraceEventType.DURATION_END, null, null, null));
}
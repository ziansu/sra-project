public static void startTracer(java.lang.String ip, int port, java.lang.String serviceName, com.github.kristofa.brave.SpanCollector spanCollector, final com.sina.amp.trace.hunter.TraceFilters traceFilters) {
    try {
        com.sina.amp.trace.hunter.Hunter.startTracer(ip, port, serviceName, spanCollector, traceFilters, com.sina.amp.trace.hunter.Hunter.RANDOM_GENERATOR.nextLong(), null, null);
    } catch (java.lang.Exception e) {
        com.sina.amp.trace.hunter.Hunter.LOG.warn(("start trace exception:" + e));
    }
}
@java.lang.Override
public void endSuccess(org.neo4j.kernel.impl.query.QuerySession session) {
    java.lang.String query = session.remove(org.neo4j.kernel.impl.query.QueryLoggerKernelExtension.QueryLogger.QUERY_STRING);
    java.lang.Long startTime = session.remove(org.neo4j.kernel.impl.query.QueryLoggerKernelExtension.QueryLogger.START_TIME);
    if (startTime != null) {
        long time = (clock.currentTimeMillis()) - startTime;
        if (time >= (thresholdMillis)) {
            log.info("%d ms: %s - %s", time, session.toString(), (query == null ? "<unknown query>" : query));
        }
    }
}
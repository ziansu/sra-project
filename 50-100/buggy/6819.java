@java.lang.Override
public synchronized void storeUpperLimit(final long limit) {
    DebugLogger.logger.debug("[PUT] Storing upper limit of {}.", limit);
    try {
        cassandraTimestampStore.storeTimestampBound(currentLimit, limit);
    } catch (java.util.ConcurrentModificationException e) {
        throw new com.palantir.timestamp.MultipleRunningTimestampServiceError(("CAS unsuccessful; this may indicate that another timestamp service is running against this" + ((" cassandra keyspace, possibly caused by multiple copies of a service running without" + " a configured set of leaders, or a CLI being run with an embedded timestamp service") + " against an already running service.")), e);
    }
}
public static long determineBatchIndex(long globalIndex) {
    return globalIndex % (org.axonframework.cassandra.eventsourcing.eventstore.EventLogEntry.BATCH_SIZE);
}
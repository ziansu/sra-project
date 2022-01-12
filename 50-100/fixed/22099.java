@java.lang.Override
public com.google.common.collect.Multimap<com.palantir.atlasdb.keyvalue.api.Cell, java.lang.Long> getAllTimestamps(java.lang.String tableName, java.util.Set<com.palantir.atlasdb.keyvalue.api.Cell> cells, long ts) {
    com.palantir.atlasdb.keyvalue.cassandra.CQLKeyValueServices.AllTimestampsCollector collector = new com.palantir.atlasdb.keyvalue.cassandra.CQLKeyValueServices.AllTimestampsCollector();
    try {
        loadWithTs(tableName, cells, ts, true, collector, deleteConsistency);
    } catch (com.palantir.atlasdb.keyvalue.cassandra.com.datastax e) {
        throw new com.palantir.atlasdb.keyvalue.api.InsufficientConsistencyException("Get all timestamps requires all Cassandra nodes to be up and available.", e);
    } catch (java.lang.Throwable t) {
        throw com.palantir.common.base.Throwables.throwUncheckedException(t);
    }
    return collector.collectedResults;
}
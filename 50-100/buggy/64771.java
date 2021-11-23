@java.lang.Override
public com.hazelcast.map.impl.record.Record loadRecordOrNull(com.hazelcast.nio.serialization.Data key, boolean backup) {
    com.hazelcast.map.impl.record.Record record = null;
    final java.lang.Object value = mapDataStore.load(key);
    if (value != null) {
        record = createRecord(value, com.hazelcast.map.impl.recordstore.DEFAULT_TTL, getNow());
        storage.put(key, record);
        evictEntries(com.hazelcast.util.Clock.currentTimeMillis());
        if (!backup) {
            saveIndex(record, null);
        }
    }
    return record;
}
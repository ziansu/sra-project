protected boolean tryEvict(com.hazelcast.nio.serialization.Data key, com.hazelcast.map.impl.record.Record record, com.hazelcast.map.impl.recordstore.RecordStore recordStore, boolean backup, long now) {
    java.lang.String mapName = recordStore.getName();
    java.lang.Object value = record.getValue();
    if (recordStore.isLocked(key)) {
        return false;
    }
    recordStore.evict(key, backup);
    if (!backup) {
        boolean expired = recordStore.isExpired(record, now, false);
        recordStore.doPostEvictionOperations(key, value, expired);
    }
    return true;
}
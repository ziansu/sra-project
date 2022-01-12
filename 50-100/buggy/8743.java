@java.lang.Override
public boolean delete(com.hazelcast.nio.serialization.Data key) {
    checkIfLoaded();
    final long now = getNow();
    final com.hazelcast.map.impl.record.Record record = getRecordOrNull(key, now, false);
    if (record == null) {
        removeIndex(record);
        mapDataStore.remove(key, now);
    }else {
        return (removeRecord(key, record, now)) != null;
    }
    return false;
}
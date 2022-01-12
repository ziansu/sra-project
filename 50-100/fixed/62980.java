@java.lang.Override
public java.lang.Object remove(com.hazelcast.nio.serialization.Data key) {
    R record = records.remove(key);
    if (record == null) {
        return null;
    }
    updateSizeEstimator((-(calculateHeapCost(record))));
    updateSizeEstimator((-(calculateHeapCost(key))));
    java.lang.Object oldValue = record.getValue();
    record.invalidate();
    return oldValue;
}
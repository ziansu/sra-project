@java.lang.Override
public java.lang.Object remove(com.hazelcast.nio.serialization.Data key) {
    R record = records.remove(key);
    updateSizeEstimator((-(calculateHeapCost(record))));
    updateSizeEstimator((-(calculateHeapCost(key))));
    java.lang.Object oldValue = record.getValue();
    if (record != null) {
        record.invalidate();
    }
    return oldValue;
}
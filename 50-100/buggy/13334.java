private void addToPending(streamkv.types.KVOperation<K, V> op, long timestamp) throws java.io.IOException {
    java.util.TreeMap<java.lang.Long, streamkv.types.KVOperation<K, V>> ops = pendingOperations.value();
    ops.put(timestamp, op);
    pendingOperations.update(ops);
}
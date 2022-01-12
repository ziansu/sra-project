private void addToPending(streamkv.types.KVOperation<K, V> op, long timestamp) throws java.io.IOException {
    java.util.TreeMap<java.lang.Long, java.util.List<streamkv.types.KVOperation<K, V>>> ops = pendingOperations.value();
    java.util.List<streamkv.types.KVOperation<K, V>> p = ops.get(timestamp);
    if (p == null) {
        p = new java.util.LinkedList<>();
        ops.put(timestamp, p);
    }
    p.add(op);
    pendingOperations.update(ops);
}
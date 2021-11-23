@java.lang.Override
public void apply(byte[] key, org.apache.kafka.streams.state.internals.MemoryLRUCacheBytesEntry value) {
    received.add(new org.apache.kafka.streams.state.internals.KeyValue<>(new java.lang.String(key), new java.lang.String(((org.apache.kafka.streams.state.internals.MemoryLRUCacheBytesEntry) (value)).value)));
}
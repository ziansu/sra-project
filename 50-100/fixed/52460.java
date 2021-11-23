@java.lang.Override
protected java.lang.Object filter(java.lang.Object response) {
    com.hazelcast.ringbuffer.impl.ReadResultSetImpl readResultSet = ((com.hazelcast.ringbuffer.impl.ReadResultSetImpl) (response));
    int readCount = readResultSet.readCount();
    java.util.List<com.hazelcast.nio.serialization.Data> items = new java.util.ArrayList<com.hazelcast.nio.serialization.Data>(readCount);
    for (int k = 0; k < (readResultSet.size()); k++) {
        items.add(readResultSet.getDataItems()[k]);
    }
    return new com.hazelcast.ringbuffer.impl.client.PortableReadResultSet<java.lang.Object>(readCount, items);
}
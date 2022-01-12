@java.lang.Override
protected java.lang.Object filter(java.lang.Object response) {
    com.hazelcast.ringbuffer.impl.ReadResultSetImpl readResultSet = ((com.hazelcast.ringbuffer.impl.ReadResultSetImpl) (response));
    int readCount = readResultSet.readCount();
    java.util.List<com.hazelcast.nio.serialization.Data> items = new java.util.ArrayList<com.hazelcast.nio.serialization.Data>(readCount);
    for (com.hazelcast.nio.serialization.Data item : readResultSet.getDataItems()) {
        items.add(item);
    }
    return new com.hazelcast.ringbuffer.impl.client.PortableReadResultSet<java.lang.Object>(readCount, items);
}
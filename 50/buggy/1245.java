private void addCustomer(com.hazelcast.core.IMap map, long customerId) {
    final com.hazelcast.map.mapstore.writebehind.WriteBehindWithEntryProcessorTest.Customer customer = new com.hazelcast.map.mapstore.writebehind.WriteBehindWithEntryProcessorTest.Customer(customerId);
    map.put(java.lang.Long.valueOf(customerId), customer);
}
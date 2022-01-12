private void addCustomer(long customerId, com.hazelcast.core.IMap map) {
    final com.hazelcast.map.mapstore.writebehind.WriteBehindWithEntryProcessorTest.Customer customer = new com.hazelcast.map.mapstore.writebehind.WriteBehindWithEntryProcessorTest.Customer();
    map.put(java.lang.Long.valueOf(customerId), customer);
}
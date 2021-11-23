private void addSubscription(com.hazelcast.core.IMap map, long customerId, final long productId) {
    map.executeOnKey(customerId, new com.hazelcast.map.AbstractEntryProcessor() {
        @java.lang.Override
        public java.lang.Object process(java.util.Map.Entry entry) {
            final com.hazelcast.map.mapstore.writebehind.WriteBehindWithEntryProcessorTest.Customer customer = ((com.hazelcast.map.mapstore.writebehind.WriteBehindWithEntryProcessorTest.Customer) (entry.getValue()));
            customer.addSubscription(new com.hazelcast.map.mapstore.writebehind.WriteBehindWithEntryProcessorTest.Subscription(productId));
            entry.setValue(customer);
            return customer.getSubscriptions().size();
        }
    });
}
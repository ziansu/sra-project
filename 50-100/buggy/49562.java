public void testRepeatedExpiryProcessingOfLargeQueue() throws java.lang.Exception {
    applyBrokerSpoolingPolicy();
    final int expiryPeriod = 500;
    applyExpiryDuration(expiryPeriod);
    createProducerAndSendMessages(org.apache.activemq.broker.region.QueuePurgeTest.NUM_TO_SEND);
    org.apache.activemq.broker.jmx.QueueViewMBean proxy = getProxyToQueueViewMBean();
    org.apache.activemq.broker.region.QueuePurgeTest.LOG.info("waiting for expiry to kick in a bunch of times to verify it does not blow mem");
    java.lang.Thread.sleep(5000);
    assertEquals(("Queue size is has not changed " + (proxy.getQueueSize())), org.apache.activemq.broker.region.QueuePurgeTest.NUM_TO_SEND, proxy.getQueueSize());
}
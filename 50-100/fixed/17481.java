protected void assertRemoteAdvisoryCount(final javax.jms.MessageConsumer advisoryConsumer, final int count) throws javax.jms.JMSException {
    int available = 0;
    org.apache.activemq.command.ActiveMQMessage message = null;
    while ((message = ((org.apache.activemq.command.ActiveMQMessage) (advisoryConsumer.receive(1000)))) != null) {
        available++;
        org.apache.activemq.network.VirtualConsumerDemandTest.LOG.info("advisory data structure: {}", message.getDataStructure());
    } 
    org.junit.Assert.assertEquals(count, available);
}
public void testInitWithNullProducer() throws java.lang.Exception {
    com.adaptris.core.jms.activemq.EmbeddedActiveMq broker = new com.adaptris.core.jms.activemq.EmbeddedActiveMq();
    broker.start();
    com.adaptris.core.jms.JmsReplyToWorkflow workflow = new com.adaptris.core.jms.JmsReplyToWorkflow();
    com.adaptris.core.Channel channel = createChannel(broker);
    workflow.setProducer(new com.adaptris.core.jms.PtpProducer());
    channel.getWorkflowList().add(workflow);
    channel.prepare();
    try {
        channel.requestInit();
        fail("shouldn't init without JMS Producer");
    } catch (java.lang.Exception e) {
    }
    broker.destroy();
}
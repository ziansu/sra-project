public void start() throws javax.jms.JMSException, javax.naming.NamingException {
    if ((namingContext) != null) {
        return ;
    }
    namingContext = new javax.naming.InitialContext();
    javax.jms.TopicConnectionFactory tcf = ((javax.jms.TopicConnectionFactory) (namingContext.lookup(configuration.getConnectionFactoryJndiName())));
    org.hawkular.bus.common.ConnectionContextFactory ccf = new org.hawkular.bus.common.ConnectionContextFactory(tcf);
    org.hawkular.bus.common.producer.ProducerConnectionContext pcc = ccf.createProducerConnectionContext(new org.hawkular.bus.common.Endpoint(Endpoint.Type.TOPIC, configuration.getInventoryChangesTopicName()));
    this.messageSender = new org.hawkular.inventory.bus.MessageSender(pcc);
    install();
}
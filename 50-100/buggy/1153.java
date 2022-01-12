protected void preApplicationProcessing(org.wso2.andes.client.message.AbstractJMSMessage jmsMsg) throws javax.jms.JMSException {
    if (((_session.getAcknowledgeMode()) == (org.wso2.andes.jms.Session.PER_MESSAGE_ACKNOWLEDGE)) || ((_session.getAcknowledgeMode()) == (org.wso2.andes.jms.Session.CLIENT_ACKNOWLEDGE))) {
        _session.addUnacknowledgedMessage(jmsMsg.getDeliveryTag());
    }
    _session.setInRecovery(false);
    preDeliver(jmsMsg);
}
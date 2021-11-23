@org.springframework.jms.annotation.JmsListener(destination = "${cmbc.most.mq.incomingQueue}", containerFactory = "DefaultJmsListenerContainerFactory")
public void onMessage(javax.jms.TextMessage message) throws javax.jms.JMSException {
    log.info("onMessage");
    log.info("onMessage - Message: {}", message);
}
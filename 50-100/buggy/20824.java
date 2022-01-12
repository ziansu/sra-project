@java.lang.Override
public void insertViewedArticle(final java.lang.Long articleId, final java.lang.Long userId) {
    javax.jms.Destination destination = new com.acne.service.impl.De();
    jmsTemplate.send(destination, new org.springframework.jms.core.MessageCreator() {
        @java.lang.Override
        public javax.jms.Message createMessage(javax.jms.Session session) throws javax.jms.JMSException {
            javax.jms.Message message = session.createMessage();
            message.setLongProperty("userId", userId);
            message.setLongProperty("articleId", articleId);
            return message;
        }
    });
}
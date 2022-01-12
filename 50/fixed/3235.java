public void sendTextMessage(java.lang.String s) throws javax.jms.JMSException {
    javax.jms.TextMessage message = session.createTextMessage(s);
    messageProducer.send(message);
}
public void sendMessage(java.lang.String text, com.therods.YetAnotherToDoList.model.User user) throws com.therods.YetAnotherToDoList.server.JMSException {
    session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
    topic = session.createTopic(java.lang.String.valueOf(user.getId()));
    messageProducer = session.createProducer(topic);
    messageProducer.send(topic, session.createTextMessage(text));
    session.close();
}
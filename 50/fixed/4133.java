public void start(java.lang.String dest) throws JMSException {
    this.dest = dest;
    conn.start();
    session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);
    consumer = session.createDurableSubscriber(session.createTopic(dest), name);
}
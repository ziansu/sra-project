public javax.jms.Connection createConnection() throws javax.jms.JMSException {
    return createConnection(properties.getUser(), properties.getPassword());
}
public javax.jms.Connection createConnection() throws javax.jms.JMSException {
    return createConnection(this.properties.getUser(), this.properties.getPassword());
}
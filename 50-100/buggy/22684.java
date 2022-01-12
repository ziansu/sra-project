public javax.jms.Connection createConnection() throws org.wso2.carbon.identity.user.store.common.messaging.JMSConnectionException {
    if (null == (connectionFactory)) {
        throw new org.wso2.carbon.identity.user.store.common.messaging.JMSConnectionException(("Connection cannot be establish to the broker. Connection Factory is null. Please " + "check the Please check the broker libs provided"));
    }
    javax.jms.Connection connection = null;
    try {
        connection = this.connectionFactory.createQueueConnection();
        return connection;
    } catch (javax.jms.JMSException e) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (java.lang.Exception ex) {
            org.wso2.carbon.identity.user.store.common.messaging.JMSConnectionFactory.LOGGER.error("Error while closing the connection", ex);
        }
        throw new org.wso2.carbon.identity.user.store.common.messaging.JMSConnectionException("Error occurred while creating queue connection", e);
    }
}
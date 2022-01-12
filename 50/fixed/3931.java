public boolean closeConnection() {
    try {
        if ((cachedConnection) != null) {
            cachedConnection.close();
        }
        return true;
    } catch (org.wso2.carbon.inbound.endpoint.protocol.jms.factory.JMSException e) {
        org.wso2.carbon.inbound.endpoint.protocol.jms.factory.CachedJMSConnectionFactory.logger.error("JMS Exception while closing the connection.", e);
    }
    return false;
}
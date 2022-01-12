public boolean closeConsumer(org.wso2.carbon.inbound.endpoint.protocol.jms.factory.MessageConsumer messageConsumer, boolean forcefully) {
    try {
        if (((this.cacheLevel) < (org.wso2.carbon.inbound.endpoint.protocol.jms.JMSConstants.CACHE_CONSUMER)) || forcefully) {
            messageConsumer.close();
        }
    } catch (org.wso2.carbon.inbound.endpoint.protocol.jms.factory.JMSException e) {
        org.wso2.carbon.inbound.endpoint.protocol.jms.factory.CachedJMSConnectionFactory.logger.error("JMS Exception while closing the consumer.", e);
    }
    return false;
}
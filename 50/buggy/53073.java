public void internalError(java.lang.String connKey, org.jdiameter.client.api.IMessage message, org.jdiameter.client.api.io.TransportException cause) {
    org.jdiameter.server.impl.MutablePeerTableImpl.logger.debug("Connection [{}] internalError [{}]", connKey, cause);
    unregister(true);
}
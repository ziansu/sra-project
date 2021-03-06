private void cleanSession(java.lang.String clientID) {
    org.eclipse.moquette.spi.impl.ProtocolProcessor.LOG.info("cleaning old saved subscriptions for client <{}>", clientID);
    subscriptions.removeForClient(clientID);
    m_messagesStore.dropMessagesInSession(clientID);
}
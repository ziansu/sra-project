private void cleanSession(java.lang.String clientID) {
    m_sessionsStore.wipeSubscriptions(clientID);
    subscriptions.removeForClient(clientID);
    m_messagesStore.dropMessagesInSession(clientID);
}
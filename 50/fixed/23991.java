private void cleanSession(java.lang.String clientID) {
    subscriptions.removeForClient(clientID);
}
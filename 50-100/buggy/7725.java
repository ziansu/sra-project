public void createConnector(io.joynr.arbitration.ArbitrationResult result) {
    connectorStatusLock.lock();
    try {
        connector = io.joynr.proxy.ConnectorFactory.create(dispatcher, messageSender, proxyParticipantId, result, qosSettings);
        connectorStatus = ConnectorStatus.ConnectorSuccesful;
        connectorSuccessfullyFinished.signal();
        if ((connector) != null) {
            sendQueuedRequests();
            sendQueuedSubscriptionRequests();
        }
    } catch (io.joynr.exceptions.JoynrIllegalStateException e) {
        e.printStackTrace();
    } finally {
        connectorStatusLock.unlock();
    }
}
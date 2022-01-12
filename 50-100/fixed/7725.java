public void createConnector(io.joynr.arbitration.ArbitrationResult result) {
    connector = io.joynr.proxy.ConnectorFactory.create(dispatcher, messageSender, proxyParticipantId, result, qosSettings);
    connectorStatusLock.lock();
    try {
        connectorStatus = ConnectorStatus.ConnectorSuccesful;
        connectorSuccessfullyFinished.signal();
        if ((connector) != null) {
            sendQueuedRequests();
            sendQueuedSubscriptionRequests();
        }
    } finally {
        connectorStatusLock.unlock();
    }
}
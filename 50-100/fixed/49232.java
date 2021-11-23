private void processDisconnection(java.util.List<org.apache.kafka.clients.ClientResponse> responses, java.lang.String nodeId, long now) {
    connectionStates.disconnected(nodeId, now);
    for (org.apache.kafka.clients.ClientRequest request : this.inFlightRequests.clearAll(nodeId)) {
        org.apache.kafka.clients.NetworkClient.log.trace("Cancelled request {} due to node {} being disconnected", request, nodeId);
        if (!(metadataUpdater.maybeHandleDisconnection(request)))
            responses.add(new org.apache.kafka.clients.ClientResponse(request, now, true, null));
        
    }
}
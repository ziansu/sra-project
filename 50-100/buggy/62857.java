void handleResponse(com.github.ambry.network.ResponseInfo responseInfo) {
    com.github.ambry.protocol.GetRequest getRequest = ((com.github.ambry.protocol.GetRequest) (responseInfo.getRequest()));
    com.github.ambry.router.GetOperation getOperation = correlationIdToGetOperation.get(getRequest.getCorrelationId());
    if (getOperations.contains(getOperation)) {
        getOperation.handleResponse(responseInfo);
        if ((getOperation.isOperationComplete()) && (getOperations.remove(getOperation))) {
            onComplete(getOperation);
        }
    }
}
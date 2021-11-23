@java.lang.Override
public void onExecutionFailure(java.lang.Throwable cause) {
    getOperationServiceImpl().onCompletionAsyncOperation(this);
    sendResponse(new com.hazelcast.spi.impl.operationservice.impl.responses.ErrorResponse(cause, getCallId(), isUrgent()));
    getLogger().severe(cause);
}
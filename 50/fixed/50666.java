@java.lang.Override
public void onExecutionFailure(java.lang.Throwable cause) {
    try {
        sendResponse(new com.hazelcast.spi.impl.operationservice.impl.responses.ErrorResponse(cause, getCallId(), isUrgent()));
    } finally {
        getOperationServiceImpl().onCompletionAsyncOperation(this);
    }
    getLogger().severe(cause);
}
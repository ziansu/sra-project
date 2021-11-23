public com.arangodb.entity.DefaultEntity executeBatch() throws com.arangodb.ArangoException {
    if (!(this.httpManager.isBatchModeActive())) {
        throw new com.arangodb.ArangoException("BatchMode is not active.");
    }
    java.util.List<com.arangodb.http.BatchPart> callStack = this.httpManager.getCallStack();
    this.cancelBatchMode();
    com.arangodb.entity.DefaultEntity result = this.batchDriver.executeBatch(callStack, this.getDefaultDatabase());
    return result;
}
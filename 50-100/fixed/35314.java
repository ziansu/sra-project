private boolean checkConnectionException(com.salesforce.dataloader.client.ConnectionException ex, java.lang.String operationName, int retryNum) {
    if (!(this.enableRetries))
        return false;
    
    final java.lang.String msg = ex.getMessage();
    if ((msg != null) && ((msg.toLowerCase().indexOf("connection reset")) >= 0)) {
        retrySleep(operationName, retryNum);
        return true;
    }
    return false;
}
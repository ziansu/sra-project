@java.lang.Override
public void notifyFailure(org.ballerinalang.connector.api.BallerinaConnectorException ex) {
    java.lang.Object carbonStatusCode = requestMessage.getProperty(Constants.HTTP_STATUS_CODE);
    int statusCode = (carbonStatusCode == null) ? 500 : java.lang.Integer.parseInt(carbonStatusCode.toString());
    java.lang.String errorMsg = ex.getMessage();
    org.ballerinalang.services.ErrorHandlerUtils.printError(ex);
    this.responseMsg = org.ballerinalang.net.http.HttpUtil.createErrorMessage(errorMsg, statusCode);
    this.executionWaitSem.release();
}
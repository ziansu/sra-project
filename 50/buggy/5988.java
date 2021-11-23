private synchronized void setAuthToken(java.lang.String newAuthToken) {
    com.salesforce.androidsdk.util.SalesforceSDKLogger.i(com.salesforce.androidsdk.rest.RestClient.TAG, ("Found account -- set token " + newAuthToken));
    authToken = newAuthToken;
}
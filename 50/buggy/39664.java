public void putBorrowerDetails(java.lang.String requestType, java.lang.String identifier) {
    buildRequest(requestType);
    finalUrl = ((requestUrl) + "/") + identifier;
}
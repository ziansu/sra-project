public java.util.List<java.lang.String> getAPIsFromAPIRequestsPerHourTable(java.lang.String fromDate, java.lang.String toDate) throws org.wso2.carbon.apimgt.usage.client.exception.APIMgtUsageQueryServiceClientException {
    org.apache.axiom.om.OMElement omElement = this.queryBetweenTwoDaysForAPIsFromAPIRequestsPerHourTable("API_REQUESTS_PERHOUR", fromDate, toDate);
    java.util.Collection<java.lang.String> apisList = getAPIsFromAPIRequestByHour(omElement);
    return new java.util.ArrayList<java.lang.String>(apisList);
}
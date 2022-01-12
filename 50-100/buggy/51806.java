private void setupGetRequest() throws java.io.IOException {
    com.google.api.services.analyticsreporting.v4.model.GetReportsRequest getRequest = new com.google.api.services.analyticsreporting.v4.model.GetReportsRequest();
    getRequest.setReportRequests(java.util.Arrays.asList(reportRequest));
    if ((fetchSize) > 0) {
        reportRequest.setPageSize(fetchSize);
    }
    reportRequest.setPageSize(fetchSize);
    reportRequest.setPageToken(pageToken);
    request = analyticsClient.reports().batchGet(getRequest);
}
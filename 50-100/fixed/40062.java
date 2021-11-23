protected com.brsanthu.googleanalytics.request.GoogleAnalyticsResponse postBatch(com.brsanthu.googleanalytics.request.GoogleAnalyticsRequest<?> gaReq) {
    com.brsanthu.googleanalytics.request.GoogleAnalyticsResponse resp = new com.brsanthu.googleanalytics.request.GoogleAnalyticsResponse();
    com.brsanthu.googleanalytics.httpclient.HttpRequest httpReq = createHttpRequest(gaReq);
    resp.setRequestParams(httpReq.getBodyParams());
    if (config.isGatherStats()) {
        gatherStats(gaReq);
    }
    synchronized(currentBatch) {
        currentBatch.add(httpReq);
    }
    submitBatch(false);
    return resp;
}
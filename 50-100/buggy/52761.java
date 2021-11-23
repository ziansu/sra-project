public com.hpe.application.automation.tools.pc.TrendReportTransactionDataRoot getTrendReportByXML(java.lang.String trendReportId, int runId) throws com.hpe.application.automation.tools.common.PcException, java.io.IOException, org.apache.http.client.ClientProtocolException {
    java.lang.String getTrendReportByXMLUrl = java.lang.String.format(((baseURL) + "/%s/%s/%s"), com.hpe.application.automation.tools.pc.PcRestProxy.TREND_REPORT_RESOURCE_NAME, trendReportId, runId);
    org.apache.http.client.methods.HttpGet getTrendReportByXMLRequest = new org.apache.http.client.methods.HttpGet(getTrendReportByXMLUrl);
    org.apache.http.HttpResponse response = executeRequest(getTrendReportByXMLRequest);
    java.lang.String trendReportByXML = org.apache.commons.io.IOUtils.toString(response.getEntity().getContent(), org.apache.commons.codec.CharEncoding.UTF_8);
    return com.hpe.application.automation.tools.pc.TrendReportTransactionDataRoot.xmlToObject(trendReportByXML);
}
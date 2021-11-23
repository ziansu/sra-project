protected void runSpider(br.com.softplan.security.zap.api.model.AnalysisInfo analysisInfo) {
    java.lang.String targetUrl = analysisInfo.getTargetUrl();
    br.com.softplan.security.zap.api.analysis.BaseAnalyzer.LOGGER.info("{} : {}", ScanType.SPIDER, targetUrl);
    try {
        br.com.softplan.security.zap.zaproxy.clientapi.core.ApiResponse resp = api.spider.scan(apiKey, targetUrl, "", "", "");
        java.lang.String scanId = ((br.com.softplan.security.zap.zaproxy.clientapi.core.ApiResponseElement) (resp)).getValue();
        waitForScanToFinish(scanId, ScanType.SPIDER);
        spiderDidRun = true;
    } catch (br.com.softplan.security.zap.zaproxy.clientapi.core.ClientApiException e) {
        handleError("Error running Spider.", e);
    }
}
public java.util.List<com.gtmetrix.TestResult> checkTestsForThresholdBreaches(java.util.List<com.gtmetrix.TestResult> testResults) {
    java.util.List<com.gtmetrix.TestResult> listResult = new java.util.ArrayList<>();
    for (com.gtmetrix.TestResult result : testResults) {
        if ((filterHtmlDownloadTime(result)) || (filterPageLoadTime(result))) {
            listResult.add(result);
        }
    }
    return listResult;
}
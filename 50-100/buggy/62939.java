public boolean writeReportsOnDisk() throws java.io.IOException {
    writeTestOverviewReport();
    writeTestCaseSummaryReport();
    writeTestsPassedReport();
    writeTestsFailedReport();
    for (com.github.bogdanlivadariu.reporting.junit.xml.models.TestSuiteModel ts : processedTestSuites) {
        if ((((java.lang.Integer.parseInt(ts.getFailures())) > 1) || ((java.lang.Integer.parseInt(ts.getErrors())) > 1)) || ((java.lang.Integer.parseInt(ts.getSkipped())) > 1)) {
            return false;
        }
    }
    return true;
}
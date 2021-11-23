public boolean writeReportsOnDisk() throws java.io.IOException {
    writeTestsByClassOverview();
    writeTestsByNameOverview();
    writeTestCaseSummaryReport();
    for (com.github.bogdanlivadariu.reporting.testng.xml.models.TestngResultsModel ts : processedTestNgReports) {
        if (((ts.getTotalClassesFailed()) > 1) || ((ts.getTotalClassesSkipped()) > 1)) {
            return false;
        }
    }
    return true;
}
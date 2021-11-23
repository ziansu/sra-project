private static com.aventstack.extentreports.reporter.ExtentHtmlReporter getHtmlReporter() {
    Utility.ExtentManager.htmlReporter = new com.aventstack.extentreports.reporter.ExtentHtmlReporter(Utility.ExtentManager.filePath);
    Utility.ExtentManager.htmlReporter.config().setChartVisibilityOnOpen(true);
    Utility.ExtentManager.htmlReporter.config().setDocumentTitle("QAV automation report");
    Utility.ExtentManager.htmlReporter.config().setReportName("Regression cycle");
    return Utility.ExtentManager.htmlReporter;
}
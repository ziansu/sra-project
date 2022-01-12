public void handleMoreButtonPressed(android.view.View pView) {
    com.yaboosh.ybtech.lasertally.TallyReportMaker tallyReportMaker = new com.yaboosh.ybtech.lasertally.TallyReportMaker(measurementsTable, companyName, jobName, "", adjustmentValue, tallyGoal, this);
    tallyReportMaker.init();
    tallyReportMaker.printTallyReport();
}
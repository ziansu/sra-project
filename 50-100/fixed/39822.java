public void initializeReport(us.mn.state.health.lims.common.action.BaseActionForm dynaForm) {
    super.initializeReport();
    java.lang.String lowDateStr = dynaForm.getString("lowerDateRange");
    java.lang.String highDateStr = dynaForm.getString("upperDateRange");
    dateRange = new us.mn.state.health.lims.reports.action.implementation.DateRange(lowDateStr, highDateStr);
    createReportParameters();
    errorFound = !(validateSubmitParameters());
    if (errorFound) {
        return ;
    }
    createReportItems();
    if ((this.reportItems.size()) == 0) {
        add1LineErrorMessage("report.error.message.noPrintableItems");
    }
    return ;
}
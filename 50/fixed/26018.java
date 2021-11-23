public int getPendingReportCount() {
    com.ozpathway.sw.erms.service.ExpenseReportManager reportManager = this.getReportManager();
    com.ozpathway.sw.erms.model.User user = this.getLoginUser();
    return reportManager.getReportCount(user.getId(), 0);
}
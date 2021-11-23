public int getPendingReportCount() {
    com.ozpathway.sw.erms.service.ExpenseReportManager reportManager = getReportManager();
    com.ozpathway.sw.erms.model.User user = getLoginUser();
    return reportManager.getReportCount(user.getId(), Constants.COUNT_ALL_TODO);
}
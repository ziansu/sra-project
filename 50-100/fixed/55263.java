@javax.annotation.PostConstruct
private void init() {
    selectedDateFrom = null;
    selectedDateTo = null;
    applicationDate = null;
    settleDate = null;
    logStatusModel = null;
    modLogStatus = null;
    inRemark = null;
    dtRowPerPage = 5;
    try {
        prepareCycleDateSelection();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}
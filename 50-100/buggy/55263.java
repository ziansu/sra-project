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
        java.lang.System.out.println("Post Construct LogStatusView");
        prepareCycleDateSelection();
        java.lang.System.out.println("Finish");
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}
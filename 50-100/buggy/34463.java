private void displayHTMLExecPlan(java.lang.String execPlan) {
    try {
        org.teiid.datatools.connectivity.ui.plan.ExecutionPlanConverter converter = new org.teiid.datatools.connectivity.ui.plan.ExecutionPlanConverter();
        java.lang.String url = converter.convert(execPlan);
        visualisation.setUrl(url);
    } catch (java.lang.Exception ex) {
        org.teiid.datatools.connectivity.ui.Activator.log(ex);
        displayNoExecPlanMessage();
    }
}
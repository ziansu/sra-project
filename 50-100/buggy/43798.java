public com.sql.ActionPlan setActionPlan(com.sql.ActionPlan actionPlan) throws java.lang.Exception {
    java.lang.String strSQL = null;
    if (this.isExist(actionPlan)) {
        this.updateActionPlan(actionPlan);
    }else {
        actionPlan = this.insertActionPlan(actionPlan);
    }
    this.setActionEntryMap(actionPlan);
    return actionPlan;
}
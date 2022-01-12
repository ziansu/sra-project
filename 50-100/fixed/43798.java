public com.sql.ActionPlan setActionPlan(com.sql.ActionPlan actionPlan) throws java.lang.Exception {
    if (this.isExist(actionPlan)) {
        this.updateActionPlan(actionPlan);
    }else {
        actionPlan = this.insertActionPlan(actionPlan);
    }
    actionPlan = this.setActionEntryMap(actionPlan);
    return actionPlan;
}
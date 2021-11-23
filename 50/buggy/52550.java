public com.rmn.testrail.service.PlanEntry updateTestPlanEntry(int planId, int entryId, com.rmn.testrail.service.UpdatePlanEntry updatePlanEntry) {
    return postRESTBodyReturn(TestRailCommand.UPDATE_PLAN_ENTRY.getCommand(), (((java.lang.Integer.toString(planId)) + "/") + (java.lang.Integer.toString(entryId))), updatePlanEntry, com.rmn.testrail.service.PlanEntry.class);
}
public com.rmn.testrail.service.PlanEntry updateTestPlanEntry(int planId, java.lang.String entryId, com.rmn.testrail.service.UpdatePlanEntry updatePlanEntry) {
    return postRESTBodyReturn(TestRailCommand.UPDATE_PLAN_ENTRY.getCommand(), (((java.lang.Integer.toString(planId)) + "/") + entryId), updatePlanEntry, com.rmn.testrail.service.PlanEntry.class);
}
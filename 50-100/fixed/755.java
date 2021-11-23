protected java.util.Set<org.yawlfoundation.yawl.engine.interfce.WorkItemRecord> getSuspendableWorkItemsInChain(java.util.Map<java.lang.String, org.yawlfoundation.yawl.worklet.selection.WorkletRunner> runners, java.lang.String caseID) {
    java.util.Set<org.yawlfoundation.yawl.engine.interfce.WorkItemRecord> result = getSuspendableWorkItems("case", caseID);
    org.yawlfoundation.yawl.worklet.selection.WorkletRunner worklet = runners.get(caseID);
    while (worklet != null) {
        java.lang.String parentCaseID = worklet.getParentCaseID();
        result.addAll(getSuspendableWorkItems("case", parentCaseID));
        worklet = runners.get(parentCaseID);
    } 
    return result;
}
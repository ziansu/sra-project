protected java.util.Set<org.yawlfoundation.yawl.engine.interfce.WorkItemRecord> getSuspendableWorkItemsInChain(org.yawlfoundation.yawl.worklet.exception.ExletRunnerCache runners, java.lang.String caseID) {
    java.util.Set<org.yawlfoundation.yawl.engine.interfce.WorkItemRecord> result = getSuspendableWorkItems("case", caseID);
    org.yawlfoundation.yawl.worklet.selection.WorkletRunner worklet = runners.getWorkletRunner(caseID);
    while (worklet != null) {
        java.lang.String parentCaseID = worklet.getParentCaseID();
        result.addAll(getSuspendableWorkItems("case", parentCaseID));
        worklet = runners.getWorkletRunner(parentCaseID);
    } 
    return result;
}
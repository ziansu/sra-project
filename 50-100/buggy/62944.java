java.util.Map<java.lang.String, java.lang.Object> evaluateDecisionTableInput(@javax.annotation.Nonnull
example.approval.model.ImmutableTaskAssignmentRequest taskAssignmentRequest) {
    java.util.Map<java.lang.String, java.lang.Object> vars = new java.util.HashMap<java.lang.String, java.lang.Object>();
    vars.put(ProcessConstant.VAR_STEP_ID, taskAssignmentRequest.stepId());
    vars.putAll(taskAssignmentRequest.variables());
    return vars;
}
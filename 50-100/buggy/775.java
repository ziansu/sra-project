public void setVariableValue(com.effektif.workflow.api.model.WorkflowInstanceId workflowInstanceId, java.lang.String activityInstanceId, java.lang.String variableId, java.lang.Object value) {
    com.effektif.workflow.impl.workflowinstance.WorkflowInstanceImpl workflowInstance = lockWorkflowInstanceWithRetry(workflowInstanceId, activityInstanceId);
    com.effektif.workflow.impl.workflowinstance.ActivityInstanceImpl activityInstance = workflowInstance.findActivityInstance(activityInstanceId);
    com.effektif.workflow.impl.workflowinstance.VariableInstanceImpl variableInstance = activityInstance.findVariableInstance(variableId);
    if ((variableInstance.type) != null) {
    }
    activityInstance.setVariableValue(variableId, value);
    workflowInstance.executeWork();
}
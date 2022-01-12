public void updateWorkflowInstanceAfterExecution(com.nitorcreations.nflow.engine.workflow.instance.WorkflowInstance instance, com.nitorcreations.nflow.engine.workflow.instance.WorkflowInstanceAction action, java.util.List<com.nitorcreations.nflow.engine.workflow.instance.WorkflowInstance> childWorkflows) {
    org.springframework.util.Assert.isTrue((action != null), "action can not be null");
    org.springframework.util.Assert.isTrue((action != null), "childWorkflows can not be null");
    if ((sqlVariants.hasUpdateableCTE()) && (childWorkflows.isEmpty())) {
        updateWorkflowInstanceWithCTE(instance, action);
    }else {
        updateWorkflowInstanceWithTransaction(instance, action, childWorkflows);
    }
}
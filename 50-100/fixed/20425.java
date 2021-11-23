public com.emc.storageos.workflow.WorkflowState getWorkflowStateFromSteps() {
    java.lang.String[] errorMessage = new java.lang.String[1];
    com.emc.storageos.workflow.Workflow.StepState stepState = com.emc.storageos.workflow.Workflow.getOverallState(getStepStatusMap(), errorMessage);
    switch (stepState) {
        case SUCCESS :
            return WorkflowState.SUCCESS;
        case ERROR :
            return WorkflowState.ERROR;
        case SUSPENDED_ERROR :
            return WorkflowState.SUSPENDED_ERROR;
        case SUSPENDED_NO_ERROR :
            return WorkflowState.SUSPENDED_NO_ERROR;
        case CANCELLED :
            return WorkflowState.ERROR;
        default :
            return getWorkflowState();
    }
}
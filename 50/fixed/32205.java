public co.cask.cdap.api.workflow.WorkflowToken deepCopy() {
    return new co.cask.cdap.internal.app.runtime.workflow.BasicWorkflowToken(this);
}
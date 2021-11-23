@java.lang.Override
public java.lang.String call() throws java.lang.Exception {
    co.cask.cdap.api.workflow.WorkflowToken copiedToken = ((co.cask.cdap.internal.app.runtime.workflow.BasicWorkflowToken) (token)).copy();
    executeAll(branch.iterator(), appSpec, instantiator, classLoader, copiedToken);
    return branch.toString();
}
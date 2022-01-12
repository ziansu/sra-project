@javax.annotation.Nullable
protected <T> T getContextVariable(java.lang.Class<T> key) throws java.io.IOException, java.lang.InterruptedException {
    org.jenkinsci.plugins.workflow.cps.CpsThread current = org.jenkinsci.plugins.workflow.cps.CpsThread.current();
    if (current != null) {
        throw new java.lang.IllegalStateException("Needs to be called within a CPS Thread");
    }
    org.jenkinsci.plugins.workflow.steps.StepExecution step = current.getStep();
    if (step != null) {
        return step.getContext().get(key);
    }
    return null;
}
protected void registerActiveWorkflow(io.subutai.common.environment.Environment environment, io.subutai.core.environment.api.CancellableWorkflow newWorkflow) {
    com.google.common.base.Preconditions.checkNotNull(environment);
    com.google.common.base.Preconditions.checkNotNull(newWorkflow);
    io.subutai.core.environment.api.CancellableWorkflow checkWorkflow = activeWorkflows.get(environment.getId());
    if (checkWorkflow != null) {
        throw new java.lang.IllegalStateException(java.lang.String.format("There is already an active workflow %s for environment %s", checkWorkflow.getClass().getSimpleName(), environment.getName()));
    }
    activeWorkflows.put(environment.getId(), newWorkflow);
}
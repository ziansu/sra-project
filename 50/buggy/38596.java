@java.lang.Override
protected void addRunnables(java.util.Map<java.lang.String, co.cask.cdap.internal.app.runtime.distributed.RunnableResource> runnables) {
    runnables.put(spec.getName(), new co.cask.cdap.internal.app.runtime.distributed.RunnableResource(new co.cask.cdap.internal.app.runtime.distributed.WorkflowTwillRunnable(spec.getName()), createResourceSpec(resources, 1)));
}
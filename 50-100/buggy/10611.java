protected void actOnResource(org.fogbowcloud.blowout.pool.AbstractResource resource, java.util.List<org.fogbowcloud.blowout.core.model.Task> tasks) {
    org.fogbowcloud.blowout.infrastructure.model.ResourceState state = resource.getState();
    if (resource.getState().equals(ResourceState.IDLE)) {
        org.fogbowcloud.blowout.core.model.Task task = chooseTaskForRunning(tasks);
        if (task != null) {
            runTask(task, resource);
        }
    }
    if (resource.getState().equals(ResourceState.TO_REMOVE)) {
        runningTasks.remove(resource);
    }
}
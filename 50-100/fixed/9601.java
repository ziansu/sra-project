public io.cattle.platform.servicediscovery.deployment.DeploymentUnitInstance start() {
    if (this.isStarted()) {
        return this;
    }
    if (((instance) != null) && (InstanceConstants.STATE_STOPPED.equals(instance.getState()))) {
        context.activityService.instance(instance, "start", "Starting stopped instance", ActivityLog.INFO);
        context.objectProcessManager.scheduleProcessInstanceAsync(InstanceConstants.PROCESS_START, instance, null);
    }
    return this;
}
@java.lang.Override
public void run() {
    for (org.apache.hadoop.yarn.server.resourcemanager.rmcontainer.RMContainer container : containers) {
        org.apache.hadoop.yarn.api.records.ContainerStatus status = org.apache.hadoop.yarn.server.resourcemanager.scheduler.SchedulerUtils.createPreemptedContainerStatus(container.getContainerId(), SchedulerUtils.PREEMPTED_CONTAINER);
        org.apache.hadoop.yarn.server.resourcemanager.scheduler.fair.FSPreemptionThread.LOG.info(("Killing container " + container));
        scheduler.completedContainer(container, status, RMContainerEventType.KILL);
        org.apache.hadoop.yarn.server.resourcemanager.scheduler.fair.FSSchedulerNode containerNode = ((org.apache.hadoop.yarn.server.resourcemanager.scheduler.fair.FSSchedulerNode) (scheduler.getNodeTracker().getNode(container.getAllocatedNode())));
        containerNode.removeContainerForPreemption(container);
    }
}
private org.apache.stratos.messaging.domain.instance.GroupInstance createGroupInstance(org.apache.stratos.messaging.domain.applications.Group group, java.lang.String networkPartitionId, java.lang.String parentInstanceId, java.lang.String partitionId) {
    java.lang.String instanceId = parentInstanceId;
    int minGroupInstances = group.getGroupMinInstances();
    int maxGroupInstances = group.getGroupMaxInstances();
    if ((minGroupInstances > 1) || (maxGroupInstances > 1)) {
        instanceId = this.generateInstanceId(group);
    }
    return org.apache.stratos.autoscaler.applications.topic.ApplicationBuilder.handleGroupInstanceCreatedEvent(appId, group.getUniqueIdentifier(), parentInstanceId, networkPartitionId, instanceId, partitionId);
}
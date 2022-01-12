public static org.apache.hadoop.yarn.server.api.protocolrecords.NMContainerStatus createNMContainerStatus(org.apache.hadoop.yarn.api.records.ApplicationAttemptId appAttemptId, int id, org.apache.hadoop.yarn.api.records.ContainerState containerState) {
    org.apache.hadoop.yarn.api.records.ContainerId containerId = org.apache.hadoop.yarn.api.records.ContainerId.newContainerId(appAttemptId, id);
    org.apache.hadoop.yarn.server.api.protocolrecords.NMContainerStatus containerReport = org.apache.hadoop.yarn.server.api.protocolrecords.NMContainerStatus.newInstance(containerId, containerState, org.apache.hadoop.yarn.api.records.Resource.newInstance(1024, 1), "recover container", 0, org.apache.hadoop.yarn.api.records.Priority.newInstance(0), 0);
    return containerReport;
}
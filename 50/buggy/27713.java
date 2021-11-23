@java.lang.Override
public void onStopContainerError(org.apache.hadoop.yarn.api.records.ContainerId containerId, java.lang.Throwable throwable) {
    hivemall.mix.yarn.ApplicationMaster.logger.error(("Failed to stop Container " + containerId));
    appMaster.allocContainers.remove(containerId);
    appMaster.activeMixServers.remove(containerId);
}
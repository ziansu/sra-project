@java.lang.Override
public void execute() throws java.lang.Exception {
    com.emc.storageos.coordinator.client.model.Site site = drUtil.getLocalSite();
    if ((failoverBarrier) == null) {
        failoverBarrier = new com.emc.storageos.systemservices.impl.vdc.VdcOpHandler.VdcPropertyBarrier(com.emc.storageos.coordinator.client.model.Constants.FAILOVER_BARRIER, com.emc.storageos.systemservices.impl.vdc.VdcOpHandler.VDC_OP_BARRIER_TIMEOUT, site.getNodeCount(), true);
    }
    if (isNewActiveSiteForFailover(site)) {
        setConcurrentRebootNeeded(true);
        coordinator.stopCoordinatorSvcMonitor();
        reconfigVdc();
        coordinator.blockUntilZookeeperIsWritableConnected(com.emc.storageos.systemservices.impl.vdc.VdcOpHandler.FAILOVER_ZK_WRITALE_WAIT_INTERVAL);
        processFailover();
        localRepository.rebaseZkSnapshot();
        waitForAllNodesAndReboot(site);
    }
    failoverBarrier = null;
}
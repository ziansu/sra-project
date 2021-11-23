private void refreshCoordinatorForSwitchover(com.emc.storageos.coordinator.client.model.Site site) throws java.lang.Exception {
    if ((isOldActiveSiteForSwitchover(site)) || (isNewActiveSiteForSwitchover(site))) {
        int switchingNodeCount = getSwitchoverNodeCount();
        com.emc.storageos.systemservices.impl.vdc.VdcOpHandler.log.info("Wait for barrier to reconfig/restart coordinator when switchover");
        com.emc.storageos.systemservices.impl.vdc.VdcOpHandler.VdcPropertyBarrier barrier = new com.emc.storageos.systemservices.impl.vdc.VdcOpHandler.VdcPropertyBarrier(com.emc.storageos.coordinator.client.model.Constants.SWITCHOVER_BARRIER, com.emc.storageos.systemservices.impl.vdc.VdcOpHandler.SWITCHOVER_BARRIER_TIMEOUT, switchingNodeCount, true);
        try {
            barrier.enter();
            localRepository.reconfigProperties("coordinator");
        } finally {
            barrier.leave();
        }
        localRepository.restart("coordinatorsvc");
    }else {
        refreshCoordinator();
    }
}
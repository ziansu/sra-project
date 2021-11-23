private void reconnectZKToActiveSite() {
    com.emc.storageos.systemservices.impl.upgrade.LocalRepository localRepository = com.emc.storageos.systemservices.impl.upgrade.LocalRepository.getInstance();
    try {
        boolean allEntered = switchToZkObserverBarrier.enter(com.emc.storageos.systemservices.impl.upgrade.CoordinatorClientExt.DR_SWITCH_BARRIER_TIMEOUT, java.util.concurrent.TimeUnit.SECONDS);
        if (allEntered) {
            try {
                localRepository.reconfigCoordinator("observer");
            } finally {
                leaveZKDoubleBarrier(switchToZkObserverBarrier, com.emc.storageos.systemservices.impl.upgrade.CoordinatorClientExt.DR_SWITCH_TO_ZK_OBSERVER_BARRIER);
            }
            localRepository.restartCoordinator("observer");
        }else {
            com.emc.storageos.systemservices.impl.upgrade.CoordinatorClientExt._log.warn("All nodes unable to enter barrier {}. Try again later", com.emc.storageos.systemservices.impl.upgrade.CoordinatorClientExt.DR_SWITCH_TO_ZK_OBSERVER_BARRIER);
        }
    } catch (java.lang.Exception ex) {
        com.emc.storageos.systemservices.impl.upgrade.CoordinatorClientExt._log.warn("Unexpected errors during switching back to zk observer. Try again later. {}", ex);
    }
}
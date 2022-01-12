@java.lang.Override
public void execute() throws java.lang.Exception {
    com.emc.storageos.coordinator.client.model.SiteState localSiteState = drUtil.getLocalSite().getState();
    if ((localSiteState.equals(SiteState.STANDBY_PAUSING)) || (localSiteState.equals(SiteState.STANDBY_PAUSED))) {
        checkAndPauseOnStandby();
        flushVdcConfigToLocal();
        refreshIPsec();
        refreshFirewall();
        localRepository.restart(Constants.GEODBSVC_NAME);
        localRepository.restart(Constants.DBSVC_NAME);
        coordinator.stopCoordinatorSvcMonitor();
    }else {
        reconfigVdc(false);
        checkAndPauseOnActive();
    }
}
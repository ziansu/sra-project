@play.mvc.Util
private static boolean isStandbySiteDownloading() {
    for (com.emc.storageos.model.dr.SiteRestRep standby : util.DisasterRecoveryUtils.getStandbySites()) {
        com.emc.vipr.model.sys.ClusterInfo clusterInfo = getSysClient().upgrade().getClusterInfo(standby.getUuid());
        if (controllers.infra.Upgrade.calculateClusterState(clusterInfo).equals(controllers.infra.Upgrade.DOWNLOADING_CLUSTER_STATE)) {
            return true;
        }
    }
    return false;
}
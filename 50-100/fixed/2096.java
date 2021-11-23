public void refreshGeoRepDataForVolume(final org.ovirt.engine.core.common.businessentities.gluster.GlusterVolumeEntity volume) {
    if (volume == null) {
        throw new org.ovirt.engine.core.common.errors.VdcBLLException(org.ovirt.engine.core.common.errors.VdcBllErrors.GlusterVolumeGeoRepSyncFailed, "No volume information");
    }
    org.ovirt.engine.core.common.businessentities.VDSGroup cluster = getClusterDao().get(volume.getClusterId());
    discoverGeoRepDataInCluster(cluster, volume);
    java.util.List<org.ovirt.engine.core.common.businessentities.gluster.GlusterGeoRepSession> geoRepSessions = getGeoRepDao().getGeoRepSessions(volume.getId());
    refreshGeoRepSessionStatusForSessions(cluster, geoRepSessions);
}
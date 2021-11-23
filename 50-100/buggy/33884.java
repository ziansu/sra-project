public com.emc.storageos.vplex.api.VPlexVirtualVolumeInfo createVirtualVolume(java.util.List<com.emc.storageos.vplex.api.clientdata.VolumeInfo> nativeVolumeInfoList, boolean isDistributed, boolean discoveryRequired, boolean preserveData, java.lang.String winningClusterId, java.util.List<com.emc.storageos.vplex.api.VPlexClusterInfo> clusterInfoList, boolean findVirtualVolume, boolean thinEnabled) throws com.emc.storageos.vplex.api.VPlexApiException {
    com.emc.storageos.vplex.api.VPlexApiClient.s_logger.info("Request for virtual volume creation on VPlex at {}", _baseURI);
    java.lang.String clusterName = null;
    if (!isDistributed) {
        clusterName = getClusterNameForId(winningClusterId);
    }
    return _virtualVolumeMgr.createVirtualVolume(nativeVolumeInfoList, isDistributed, discoveryRequired, preserveData, winningClusterId, clusterInfoList, findVirtualVolume, thinEnabled, clusterName);
}
public void precheck() {
    com.emc.sa.service.vipr.block.ExportBlockVolumeHelper.precheckExportPathParameters(minPaths, maxPaths, pathsPerInitiator);
    com.emc.sa.service.vipr.block.ExportBlockVolumeHelper.precheckPortGroupParameter(null, virtualPool, portGroup);
    if (com.emc.sa.service.vipr.block.BlockStorageUtils.isHost(hostId)) {
        host = com.emc.sa.service.vipr.block.BlockStorageUtils.getHost(hostId);
    }else {
        cluster = com.emc.sa.service.vipr.block.BlockStorageUtils.getCluster(hostId);
    }
    com.emc.sa.service.vipr.block.BlockStorageUtils.checkEvents(((host) != null ? host : cluster));
}
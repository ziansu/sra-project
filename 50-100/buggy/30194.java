public void precheck() {
    com.emc.sa.service.vipr.block.ExportBlockVolumeHelper.precheckExportPathParameters(minPaths, maxPaths, pathsPerInitiator);
    if (com.emc.sa.service.vipr.block.BlockStorageUtils.isHost(hostId)) {
        host = com.emc.sa.service.vipr.block.BlockStorageUtils.getHost(hostId);
    }else {
        cluster = com.emc.sa.service.vipr.block.BlockStorageUtils.getCluster(hostId);
    }
    com.emc.sa.service.vipr.block.BlockStorageUtils.checkEvents(hostId);
}
private com.emc.storageos.api.service.impl.placement.Scheduler getFileServiceImpl(com.emc.storageos.db.client.model.VirtualPool vpool) {
    com.emc.storageos.api.service.impl.placement.Scheduler scheduler;
    if (((vpool.getFileReplicationType().equals(FileReplicationType.LOCAL.name())) || (vpool.getFileReplicationType().equals(FileReplicationType.REMOTE.name()))) || (com.emc.storageos.db.client.model.VirtualPool.vPoolSpecifiesFileReplication(vpool))) {
        scheduler = storageSchedulers.get("mirrorfile");
    }else {
        scheduler = storageSchedulers.get("file");
    }
    return scheduler;
}
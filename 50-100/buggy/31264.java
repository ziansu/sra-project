@java.lang.Override
public void execute() {
    com.emc.vipr.client.Tasks<? extends com.emc.storageos.model.DataObjectRestRep> tasks;
    if (com.emc.sa.service.vipr.block.ConsistencyUtils.isVolumeStorageType(storageType)) {
        for (com.emc.storageos.model.block.BlockObjectRestRep volume : volumes) {
            tasks = execute(new com.emc.sa.service.vipr.block.tasks.CreateBlockSnapshot(volume.getId(), type, nameParam, readOnly));
            addAffectedResources(tasks);
        }
    }else {
        for (java.lang.String consistencyGroupId : volumeIds) {
            tasks = com.emc.sa.service.vipr.block.ConsistencyUtils.createSnapshot(uri(consistencyGroupId), nameParam);
            addAffectedResources(tasks);
        }
    }
}
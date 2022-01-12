@java.lang.Override
public void execute() {
    com.emc.vipr.client.Tasks<? extends com.emc.storageos.model.DataObjectRestRep> tasks = null;
    if (com.emc.sa.service.vipr.block.ConsistencyUtils.isVolumeStorageType(storageType)) {
        for (java.lang.String snapshotId : snapshotIds) {
            tasks = execute(new com.emc.sa.service.vipr.block.tasks.DeactivateBlockSnapshot(snapshotId));
            addAffectedResources(tasks);
        }
    }else {
        tasks = com.emc.sa.service.vipr.block.ConsistencyUtils.removeSnapshot(consistencyGroupId);
        addAffectedResources(tasks);
    }
}
@java.lang.Override
public void execute() {
    for (java.lang.String snapshotId : snapshotIds) {
        com.emc.vipr.client.Tasks<? extends com.emc.storageos.model.DataObjectRestRep> tasks;
        if (com.emc.sa.service.vipr.block.ConsistencyUtils.isVolumeStorageType(storageType)) {
            tasks = execute(new com.emc.sa.service.vipr.block.tasks.DeactivateBlockSnapshot(snapshotId));
        }else {
            tasks = com.emc.sa.service.vipr.block.ConsistencyUtils.removeSnapshot(consistencyGroupId);
        }
        addAffectedResources(tasks);
    }
}
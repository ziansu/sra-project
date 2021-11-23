private org.ovirt.engine.core.common.businessentities.Snapshot getSnapshot(org.ovirt.engine.core.common.businessentities.storage.CinderDisk lastCinderVolume) {
    org.ovirt.engine.core.compat.Guid vmSnapshotId = lastCinderVolume.getVmSnapshotId();
    org.ovirt.engine.core.common.businessentities.Snapshot updated = null;
    if ((vmSnapshotId != null) && (!(Guid.Empty.equals(vmSnapshotId)))) {
        org.ovirt.engine.core.common.businessentities.Snapshot snapshot = org.ovirt.engine.core.bll.storage.RemoveCinderDiskCommand.getSnapshotDao().get(vmSnapshotId);
        if (snapshot != null) {
            updated = org.ovirt.engine.core.bll.ImagesHandler.prepareSnapshotConfigWithoutImageSingleImage(snapshot, lastCinderVolume.getImageId());
        }
    }
    return updated;
}
private void removeOtherImageAndParents(org.ovirt.engine.core.compat.Guid imageId, org.ovirt.engine.core.compat.Guid lastParent) {
    org.ovirt.engine.core.common.businessentities.storage.DiskImage image = org.ovirt.engine.core.bll.RestoreFromSnapshotCommand.getDiskImageDao().getSnapshotById(imageId);
    org.ovirt.engine.core.compat.Guid currentParent = image.getParentId();
    removeSnapshot(image);
    while (!(lastParent.equals(currentParent))) {
        image = org.ovirt.engine.core.bll.RestoreFromSnapshotCommand.getDiskImageDao().getSnapshotById(currentParent);
        if (image == null) {
            return ;
        }
        currentParent = image.getParentId();
        removeSnapshot(image);
    } 
}
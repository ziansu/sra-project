private boolean isLimitExceeded(com.woorea.openstack.cinder.model.Limits limits, org.ovirt.engine.core.common.businessentities.storage.VolumeClassification cinderType, int diskCount) {
    if (cinderType == (org.ovirt.engine.core.common.businessentities.storage.VolumeClassification.Snapshot)) {
        return ((limits.getAbsolute().getTotalSnapshotsUsed()) + diskCount) > (limits.getAbsolute().getMaxTotalSnapshots());
    }
    if (cinderType == (org.ovirt.engine.core.common.businessentities.storage.VolumeClassification.Volume)) {
        return ((limits.getAbsolute().getTotalVolumesUsed()) + diskCount) > (limits.getAbsolute().getMaxTotalVolumes());
    }
    return false;
}
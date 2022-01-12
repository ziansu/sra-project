public org.ovirt.engine.core.common.businessentities.storage.VolumeClassification deleteVolumeByClassificationType(org.ovirt.engine.core.common.businessentities.storage.CinderDisk cinderDisk) {
    org.ovirt.engine.core.common.businessentities.storage.VolumeClassification cinderVolumeType = cinderDisk.getVolumeClassification();
    if (cinderVolumeType == (org.ovirt.engine.core.common.businessentities.storage.VolumeClassification.Volume)) {
        deleteVolume(cinderDisk);
    }else
        if (cinderVolumeType == (org.ovirt.engine.core.common.businessentities.storage.VolumeClassification.Snapshot)) {
            deleteSnapshot(cinderDisk.getImageId());
        }else {
            org.ovirt.engine.core.bll.storage.CinderBroker.log.error("Error, could not determine Cinder entity {} with id {} from Cinder provider.", cinderDisk.getDiskAlias(), cinderDisk.getImageId());
        }
    
    return cinderVolumeType;
}
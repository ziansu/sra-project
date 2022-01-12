public org.pathirage.thulitha.StorageVolume getStorageVolumeWithMaxRemainingCapacity() {
    java.util.Collections.sort(storageVolumes);
    org.pathirage.thulitha.StorageVolume maxSv = storageVolumes.get(((storageVolumes.size()) - 1));
    if ((storageVolumes.size()) < (maxStorageVolumes)) {
        return new org.pathirage.thulitha.StorageVolume(id, storageVolumeType, instanceType, iopSizeKB);
    }else {
        return maxSv;
    }
}
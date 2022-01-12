public java.util.Collection<javax.cim.CIMObjectPath> getStorageSynchronizationsInRemoteGroup(com.emc.storageos.db.client.model.StorageSystem provider, com.emc.storageos.db.client.model.RemoteDirectorGroup group) {
    javax.cim.CIMObjectPath remoteGroupPath = cimPath.getRemoteReplicationCollection(provider, group);
    java.util.List<javax.cim.CIMObjectPath> volumePathsInRemoteGroup = getVolumePathsInRemoteGroup(provider, remoteGroupPath);
    java.util.List<javax.cim.CIMObjectPath> result = new java.util.ArrayList<>();
    for (javax.cim.CIMObjectPath volumePath : volumePathsInRemoteGroup) {
        javax.cim.CIMObjectPath storageSync = getStorageSynchronizationFromVolume(provider, volumePath, group);
        result.add(storageSync);
    }
    return result;
}
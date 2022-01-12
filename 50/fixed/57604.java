public java.util.List<com.emc.storageos.model.NamedRelatedResourceRep> listByStorageSystemVirtualPool(java.net.URI storageSystemId, java.net.URI vpool) {
    com.emc.storageos.model.file.UnManagedFileSystemList response = client.get(com.emc.storageos.model.file.UnManagedFileSystemList.class, PathConstants.UNMANAGED_FILESYSTEM_BY_STORAGE_SYSTEM_VIRTUAL_POOL_URL, storageSystemId, vpool);
    return com.emc.vipr.client.core.util.ResourceUtils.defaultList(response.getNamedUnManagedFileSystem());
}
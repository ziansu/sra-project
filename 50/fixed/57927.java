public boolean isStorageSystemManagedByProvider() {
    return ((_systemType) != null) && (com.emc.storageos.db.client.model.Type.isProviderStorageSystem(_systemType));
}
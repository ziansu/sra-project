private static java.lang.String getStorageKey(com.emc.storageos.db.client.DbClient dbClient, java.net.URI storageURI) {
    if (storageURI == null) {
        return "";
    }
    com.emc.storageos.db.client.model.StorageSystem storage = dbClient.queryObject(com.emc.storageos.db.client.model.StorageSystem.class, storageURI);
    if (storage != null) {
        return storage.getNativeGuid();
    }
    com.emc.storageos.db.client.model.ProtectionSystem protection = dbClient.queryObject(com.emc.storageos.db.client.model.ProtectionSystem.class, storageURI);
    if (protection != null) {
        return protection.getNativeGuid();
    }
    return storageURI.toString();
}
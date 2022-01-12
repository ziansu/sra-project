public static java.lang.String getConsistencyGroupStorageKey(com.emc.storageos.db.client.DbClient dbClient, java.net.URI cgURI, java.net.URI storageURI) {
    com.emc.storageos.db.client.model.BlockConsistencyGroup consistencyGroup = dbClient.queryObject(com.emc.storageos.db.client.model.BlockConsistencyGroup.class, cgURI);
    com.emc.storageos.db.client.model.StorageSystem storage = dbClient.queryObject(com.emc.storageos.db.client.model.StorageSystem.class, storageURI);
    return ((consistencyGroup.getLabel()) + "::") + (storage.getNativeGuid());
}
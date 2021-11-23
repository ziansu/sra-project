public static java.lang.String getConsistencyGroupStorageKey(com.emc.storageos.db.client.DbClient dbClient, java.net.URI cgURI, java.net.URI storageURI) {
    com.emc.storageos.db.client.model.BlockConsistencyGroup consistencyGroup = dbClient.queryObject(com.emc.storageos.db.client.model.BlockConsistencyGroup.class, cgURI);
    java.lang.String storageKey = com.emc.storageos.volumecontroller.impl.ControllerLockingUtil.getStorageKey(dbClient, storageURI);
    if (consistencyGroup != null) {
        return ((consistencyGroup.getLabel()) + (com.emc.storageos.volumecontroller.impl.ControllerLockingUtil.DELIMITER)) + storageKey;
    }else {
        return ((cgURI.toString()) + (com.emc.storageos.volumecontroller.impl.ControllerLockingUtil.DELIMITER)) + storageKey;
    }
}
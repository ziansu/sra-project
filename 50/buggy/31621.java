private void execOb(java.lang.String methodName, java.lang.Object... args) throws com.emc.storageos.svcs.errorhandling.resources.InternalException {
    java.lang.StringBuilder logMsgBuilder = new java.lang.StringBuilder(java.lang.String.format("ObjectControllerImpl Method=%s StorageSystem.class:%s", methodName, com.emc.storageos.db.client.model.StorageSystem.class));
    queueTask(_dbClient, com.emc.storageos.db.client.model.StorageSystem.class, _dispatcher, methodName, args);
}
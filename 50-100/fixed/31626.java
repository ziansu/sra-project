public static java.lang.String generateReplicationGroupName(com.emc.storageos.db.client.model.StorageSystem storage, java.net.URI cgUri, java.lang.String replicationGroupName, com.emc.storageos.db.client.DbClient dbClient) {
    com.emc.storageos.db.client.model.BlockConsistencyGroup cg = dbClient.queryObject(com.emc.storageos.db.client.model.BlockConsistencyGroup.class, cgUri);
    if ((cg == null) || (cg.getInactive())) {
        com.emc.storageos.volumecontroller.impl.ControllerUtils.s_logger.warn(java.lang.String.format("BlockConsistencyGroup with uri %s does not exist or is inactive", cgUri.toString()));
    }
    return com.emc.storageos.volumecontroller.impl.ControllerUtils.generateReplicationGroupName(storage, cg, replicationGroupName, dbClient);
}
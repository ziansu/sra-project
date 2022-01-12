public static void createRemoteReplicationPairForSrdfPair(java.net.URI sourceUri, java.net.URI targetUri, com.emc.storageos.db.client.DbClient dbClient) {
    try {
        com.emc.storageos.db.client.model.remotereplication.RemoteReplicationPair driverRrPair = null;
        driverRrPair = com.emc.storageos.remotereplicationcontroller.RemoteReplicationUtils.buildRemoteReplicationPairForSrdfPair(sourceUri, targetUri, dbClient);
        com.emc.storageos.volumecontroller.impl.externaldevice.RemoteReplicationDataClient remoteReplicationDataClient = new com.emc.storageos.volumecontroller.impl.externaldevice.RemoteReplicationDataClientImpl(dbClient);
        remoteReplicationDataClient.createRemoteReplicationPair(driverRrPair, sourceUri, sourceUri);
    } catch (java.lang.Exception ex) {
        java.lang.String msg = java.lang.String.format("Failed to create remote replication pair for srdf pair: %s -> %s", sourceUri, targetUri);
        com.emc.storageos.remotereplicationcontroller.RemoteReplicationUtils._log.error(msg, ex);
        throw new java.lang.RuntimeException(msg, ex);
    }
}
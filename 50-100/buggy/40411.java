public static void cleanStaleReferences(java.net.URI exportGroupURI, com.emc.storageos.db.client.DbClient dbClient) {
    com.emc.storageos.db.client.model.ExportGroup exportGroup = dbClient.queryObject(com.emc.storageos.db.client.model.ExportGroup.class, exportGroupURI);
    com.emc.storageos.util.ExportUtils.cleanStaleMaskReferences(exportGroup, dbClient);
    com.emc.storageos.util.ExportUtils.cleanStaleInitiatorReferences(exportGroup, dbClient);
    com.emc.storageos.util.ExportUtils.cleanStaleHostReferences(exportGroup, dbClient);
    com.emc.storageos.util.ExportUtils.cleanStaleClusterReferences(exportGroup, dbClient);
    com.emc.storageos.util.ExportUtils.cleanStaleVolumeReferences(exportGroup, dbClient);
    if ((null != exportGroup) && (!(exportGroup.getInactive()))) {
        dbClient.updateObject(exportGroup);
    }
}
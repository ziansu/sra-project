public static void cleanStaleReferences(com.emc.storageos.db.client.model.ExportGroup exportGroup, com.emc.storageos.db.client.DbClient dbClient) {
    if ((null != exportGroup) && (!(exportGroup.getInactive()))) {
        com.emc.storageos.util.ExportUtils.cleanStaleMaskReferences(exportGroup, dbClient);
        com.emc.storageos.util.ExportUtils.cleanStaleInitiatorReferences(exportGroup, dbClient);
        com.emc.storageos.util.ExportUtils.cleanStaleHostReferences(exportGroup, dbClient);
        com.emc.storageos.util.ExportUtils.cleanStaleClusterReferences(exportGroup, dbClient);
        com.emc.storageos.util.ExportUtils.cleanStaleVolumeReferences(exportGroup, dbClient);
        dbClient.updateObject(exportGroup);
    }
}
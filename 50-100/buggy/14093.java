private static com.emc.storageos.db.client.model.remotereplication.RemoteReplicationSet getRemoteReplicationSetForRrGroup(com.emc.storageos.db.client.DbClient dbClient, com.emc.storageos.db.client.model.remotereplication.RemoteReplicationGroup rrGroup) {
    java.util.List<com.emc.storageos.db.client.model.remotereplication.RemoteReplicationSet> rrSets = com.emc.storageos.db.client.util.CustomQueryUtility.queryActiveResourcesByAltId(dbClient, com.emc.storageos.db.client.model.remotereplication.RemoteReplicationSet.class, "storageSystemType", rrGroup.getStorageSystemType());
    for (com.emc.storageos.db.client.model.remotereplication.RemoteReplicationSet rrSet : rrSets) {
        if ((rrSet.getSystemToRolesMap().containsKey(rrGroup.getSourceSystem().toString())) && (rrSet.getSystemToRolesMap().containsKey(rrGroup.getTargetSystem().toString()))) {
            return rrSet;
        }
    }
    return null;
}
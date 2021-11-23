private boolean isClusterInExport(com.emc.storageos.db.client.model.Cluster cluster) {
    java.util.List<com.emc.storageos.db.client.model.ExportGroup> exportGroups = com.emc.storageos.db.client.util.CustomQueryUtility.queryActiveResourcesByConstraint(_dbClient, com.emc.storageos.db.client.model.ExportGroup.class, AlternateIdConstraint.Factory.getConstraint(com.emc.storageos.db.client.model.ExportGroup.class, "clusters", cluster.getId().toString()));
    return (exportGroups.size()) > 0;
}
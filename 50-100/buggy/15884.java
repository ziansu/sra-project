private static java.util.List<com.emc.storageos.db.client.model.Cluster> getVolumeGroupClusters(com.emc.storageos.db.client.DbClient dbClient, com.emc.storageos.db.client.model.VolumeGroup volumeGroup) {
    java.util.List<com.emc.storageos.db.client.model.Cluster> result = new java.util.ArrayList<com.emc.storageos.db.client.model.Cluster>();
    final java.util.List<com.emc.storageos.db.client.model.Cluster> clusters = com.emc.storageos.db.client.util.CustomQueryUtility.queryActiveResourcesByConstraint(dbClient, com.emc.storageos.db.client.model.Cluster.class, AlternateIdConstraint.Factory.getClustersByVolumeGroupId(volumeGroup.getId().toString()));
    return clusters;
}
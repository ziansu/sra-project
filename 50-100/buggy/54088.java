@java.lang.Override
public java.util.Collection<? extends java.lang.String> getReplicationGroupNames(com.emc.storageos.db.client.model.VolumeGroup group) {
    java.util.List<java.lang.String> groupNames = new java.util.ArrayList<java.lang.String>();
    final java.util.List<com.emc.storageos.db.client.model.Volume> volumes = com.emc.storageos.db.client.util.CustomQueryUtility.queryActiveResourcesByConstraint(_dbClient, com.emc.storageos.db.client.model.Volume.class, AlternateIdConstraint.Factory.getVolumesByVolumeGroupId(group.getId().toString()));
    for (com.emc.storageos.db.client.model.Volume volume : volumes) {
        if ((volume.getReplicationGroupInstance()) != null) {
            groupNames.add(volume.getReplicationGroupInstance());
        }
    }
    return groupNames;
}
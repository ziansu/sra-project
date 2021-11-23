@java.lang.Override
protected com.emc.vipr.client.Tasks<com.emc.storageos.model.block.VolumeRestRep> doExecute() throws java.lang.Exception {
    com.emc.storageos.model.block.VolumeVirtualArrayChangeParam param = new com.emc.storageos.model.block.VolumeVirtualArrayChangeParam();
    param.setVirtualArray(targetVirtualArrayId);
    param.setVolumes(volumeIds);
    if (migrationType.equals(MigrationTypeEnum.HOST.toString())) {
        param.setIsHostMigration(com.emc.sa.service.vipr.block.tasks.True);
        param.setMigrationHost(migrationHost);
    }else
        if (migrationType.equals(MigrationTypeEnum.DRIVER.toString())) {
            param.setIsHostMigration(com.emc.sa.service.vipr.block.tasks.False);
        }
    
    return getClient().blockVolumes().changeVirtualArrayForVolumes(param);
}
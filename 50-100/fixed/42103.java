public com.vmware.vim25.mo.Datastore createVmfsDatastore(com.vmware.vim25.mo.HostSystem host, com.vmware.vim25.mo.ClusterComputeResource cluster, java.net.URI hostOrClusterId, com.emc.storageos.model.block.BlockObjectRestRep volume, java.lang.String datastoreName) {
    com.vmware.vim25.HostScsiDisk disk = findScsiDisk(host, cluster, volume, true);
    com.vmware.vim25.mo.Datastore datastore = com.emc.sa.service.vipr.ViPRExecutionUtils.execute(new com.emc.sa.service.vmware.block.tasks.CreateVmfsDatastore(host, disk, datastoreName));
    com.emc.sa.service.vipr.ViPRExecutionUtils.addAffectedResource(volume);
    addVmfsDatastoreTag(volume, hostOrClusterId, datastoreName);
    com.emc.sa.engine.ExecutionUtils.clearRollback();
    return datastore;
}
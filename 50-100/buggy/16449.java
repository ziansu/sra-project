public void extendVmfsDatastore(com.vmware.vim25.mo.HostSystem host, com.vmware.vim25.mo.ClusterComputeResource cluster, java.net.URI hostOrClusterId, com.emc.storageos.model.block.BlockObjectRestRep volume, com.vmware.vim25.mo.Datastore datastore) {
    com.vmware.vim25.HostScsiDisk disk = findScsiDisk(host, cluster, volume);
    com.emc.sa.service.vipr.ViPRExecutionUtils.execute(new com.emc.sa.service.vmware.block.tasks.ExtendVmfsDatastore(host, disk, datastore));
    com.emc.sa.service.vipr.ViPRExecutionUtils.addAffectedResource(volume);
    addVmfsDatastoreTag(volume, hostOrClusterId, datastore.getName());
    com.emc.sa.engine.ExecutionUtils.clearRollback();
}
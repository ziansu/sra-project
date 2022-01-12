@java.lang.Override
public void execute() throws java.lang.Exception {
    for (java.util.Map.Entry<com.vmware.vim25.mo.Datastore, java.util.List<com.emc.storageos.model.block.VolumeRestRep>> entry : datastores.entrySet()) {
        vmware.deleteVmfsDatastore(entry.getValue(), hostId, entry.getKey());
    }
    if ((hostId) != null) {
        com.emc.sa.engine.ExecutionUtils.addAffectedResource(hostId.toString());
    }
}
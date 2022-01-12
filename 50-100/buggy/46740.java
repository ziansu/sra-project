@java.lang.Override
public void precheck() throws java.lang.Exception {
    super.precheck();
    volume = com.emc.sa.service.vipr.block.BlockStorageUtils.getVolume(volumeId);
    acquireHostLock();
    datastore = vmware.getDatastore(datacenter.getLabel(), datastoreName);
    vmware.refreshStorage(host, cluster);
    vmware.verifySupportedMultipathPolicy(host, multipathPolicy);
    vmware.disconnect();
}
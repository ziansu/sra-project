@java.lang.Override
public void precheck() throws java.lang.Exception {
    super.precheck();
    exportBlockVolumeHelper.precheck();
    acquireHostLock();
    vmware.refreshStorage(host, cluster);
    vmware.verifyDatastoreDoesNotExist(datacenter.getLabel(), datastoreName);
    vmware.verifySupportedMultipathPolicy(host, multipathPolicy);
    vmware.disconnect();
}
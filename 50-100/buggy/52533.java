public void unmountVmfsDatastore(com.vmware.vim25.mo.HostSystem host, com.vmware.vim25.mo.ClusterComputeResource cluster, final com.vmware.vim25.mo.Datastore datastore) {
    enterMaintenanceMode(datastore);
    setStorageIOControl(datastore, false);
    java.util.List<com.vmware.vim25.mo.HostSystem> hosts = (host != null) ? com.google.common.collect.Lists.newArrayList(host) : com.google.common.collect.Lists.newArrayList(cluster.getHosts());
    executeOnHosts(hosts, new com.emc.sa.service.vmware.VMwareSupport.HostSystemCallback() {
        @java.lang.Override
        public void exec(com.vmware.vim25.mo.HostSystem host) {
            unmountVmfsDatastore(host, datastore);
        }
    });
}
public boolean isVFabricAvailable(org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NodeId target) {
    if (((this.vfabricDataMgrStore) == null) || ((this.vfabricDataMgrStore.isEmpty()) == (java.lang.Boolean.TRUE))) {
        org.opendaylight.faas.fabricmgr.VContainerLDConfigMgr.LOG.error("FABMGR: ERROR: getAvailableVfabricId: vfabricDataMgrStore is null");
        return false;
    }
    for (java.util.Map.Entry<org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NodeId, org.opendaylight.faas.fabricmgr.VFabricConfigDataMgr> entry : this.vfabricDataMgrStore.entrySet()) {
        if ((entry.getKey()) == target) {
            return true;
        }
    }
    return false;
}
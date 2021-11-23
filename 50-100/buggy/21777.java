public boolean hasBridge(java.lang.String tname) {
    org.opendaylight.controller.md.sal.common.api.data.LogicalDatastoreType oper = org.opendaylight.controller.md.sal.common.api.data.LogicalDatastoreType.OPERATIONAL;
    org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtns.Vtn opt = mdSal.read(LogicalDatastoreType.OPERATIONAL, org.opendaylight.nic.vtn.renderer.VTNManagerService.getTenantPath(tname));
    boolean ret;
    if (opt != null) {
        java.util.List<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.list.Vbridge> vbridges = opt.getVbridge();
        ret = (vbridges != null) && (!(vbridges.isEmpty()));
    }else {
        ret = false;
    }
    return ret;
}
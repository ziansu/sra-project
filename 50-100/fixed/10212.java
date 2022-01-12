private boolean removeLispMapping(org.opendaylight.yang.gen.v1.urn.opendaylight.lfm.control.plane.rev150314.lispaddress.LispAddressContainer eid) {
    com.google.common.base.Preconditions.checkNotNull(eid, "Cannot REMOVE new Mapping to LISP configuration store, EID is null.");
    try {
        org.opendaylight.sfc.sfc_lisp.provider.api.SfcLispFlowMappingApi.LOG.trace("REMOVE mapping for EID: {}", eid);
        java.util.concurrent.Future<org.opendaylight.yangtools.yang.common.RpcResult<java.lang.Void>> result = lfmService.removeMapping(org.opendaylight.sfc.sfc_lisp.provider.LispUtil.buildRemoveMappingInput(eid, 0));
        result.get().getResult();
        return true;
    } catch (java.lang.Exception e) {
        org.opendaylight.sfc.sfc_lisp.provider.api.SfcLispFlowMappingApi.LOG.warn("Failed to REMOVE mapping for EID {} : {}", eid, e);
    }
    return false;
}
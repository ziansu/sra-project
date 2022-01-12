public void updateVNFRStatus(java.lang.String nsr_id, java.lang.String vnfr_id, org.openbaton.catalogue.mano.record.Status status) {
    try {
        org.openbaton.catalogue.mano.record.VirtualNetworkFunctionRecord vnfr = nfvoRequestor.getNetworkServiceRecordAgent().getVirtualNetworkFunctionRecord(nsr_id, vnfr_id);
        vnfr.setStatus(status);
        nfvoRequestor.getNetworkServiceRecordAgent().updateVNFR(nsr_id, vnfr_id, vnfr);
    } catch (org.openbaton.sdk.api.exception.SDKException e) {
        log.error(e.getMessage(), e);
    }
}
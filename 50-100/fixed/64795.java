@javax.annotation.Nonnull
@java.lang.Override
public org.dcache.srm.v2_2.SrmRmResponse rm(org.apache.axis.types.URI... surls) throws java.rmi.RemoteException, org.dcache.srm.SRMException {
    org.dcache.srm.v2_2.SrmRmResponse response = srm.srmRm(new org.dcache.srm.v2_2.SrmRmRequest(null, new org.dcache.srm.v2_2.ArrayOfAnyURI(surls), null));
    if ((response.getArrayOfFileStatuses().getStatusArray()) == null) {
        org.dcache.srm.shell.TStatusCodes.checkSuccess(response.getReturnStatus());
    }else {
        org.dcache.srm.shell.TStatusCodes.checkSuccess(response.getReturnStatus(), TStatusCode.SRM_SUCCESS, TStatusCode.SRM_PARTIAL_SUCCESS, TStatusCode.SRM_FAILURE);
    }
    return response;
}
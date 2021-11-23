@java.lang.Override
public void rmdir(org.apache.axis.types.URI lookup, boolean recursive) throws java.rmi.RemoteException, org.dcache.srm.SRMException {
    org.dcache.srm.v2_2.SrmRmdirResponse response = srm.srmRmdir(new org.dcache.srm.v2_2.SrmRmdirRequest(null, lookup, null, recursive));
    org.dcache.srm.shell.TStatusCodes.checkSuccess(response.getReturnStatus(), TStatusCode.SRM_SUCCESS);
}
@javax.annotation.Nonnull
@java.lang.Override
public java.lang.String[] getSpaceTokens(java.lang.String userSpaceTokenDescription) throws java.rmi.RemoteException, org.dcache.srm.SRMException {
    org.dcache.srm.v2_2.SrmGetSpaceTokensResponse response = srm.srmGetSpaceTokens(new org.dcache.srm.v2_2.SrmGetSpaceTokensRequest(userSpaceTokenDescription, null));
    org.dcache.srm.shell.TStatusCodes.checkSuccess(response.getReturnStatus());
    org.dcache.srm.v2_2.ArrayOfString arrayOfSpaceTokens = response.getArrayOfSpaceTokens();
    return arrayOfSpaceTokens != null ? arrayOfSpaceTokens.getStringArray() : new java.lang.String[0];
}
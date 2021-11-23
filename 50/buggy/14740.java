@javax.annotation.Nonnull
@java.lang.Override
public org.dcache.srm.v2_2.TPermissionMode checkPermission(org.apache.axis.types.URI surl) throws java.rmi.RemoteException, org.dcache.srm.SRMException {
    org.dcache.srm.v2_2.TSURLPermissionReturn[] permission = checkPermissions(surl);
    org.dcache.srm.shell.TStatusCodes.checkSuccess(permission[0].getStatus(), TStatusCode.SRM_SUCCESS);
    return permission[0].getPermission();
}
@javax.annotation.Nonnull
@java.lang.Override
public org.dcache.srm.v2_2.TPermissionReturn getPermission(org.apache.axis.types.URI surl) throws java.rmi.RemoteException, org.dcache.srm.SRMException {
    org.dcache.srm.v2_2.TPermissionReturn[] permission = getPermissions(surl);
    org.dcache.srm.shell.TStatusCodes.checkSuccess(permission[0].getStatus());
    return permission[0];
}
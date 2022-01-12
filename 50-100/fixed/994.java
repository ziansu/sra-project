protected void applyAcl(org.apache.activemq.security.AuthorizationEntry entry, org.apache.activemq.security.SimpleCachedLDAPAuthorizationMap.PermissionType permissionType, java.util.Set<java.lang.Object> acls) {
    switch (permissionType) {
        case READ :
            entry.setReadACLs(acls);
            break;
        case WRITE :
            entry.setWriteACLs(acls);
            break;
        case ADMIN :
            entry.setAdminACLs(acls);
            break;
        case BROWSE :
            entry.setBrowseACLs(acls);
            break;
        default :
            throw new java.lang.IllegalArgumentException((("Unknown permission " + permissionType) + "."));
    }
}
@java.lang.Override
protected java.util.List<com.dotmarketing.business.Permission> getInheritablePermissions(com.dotmarketing.business.Permissionable permissionable, boolean bitPermissions) throws com.dotmarketing.exception.DotDataException {
    java.util.List<com.dotmarketing.business.Permission> bitPermissionsList = permissionCache.getPermissionsFromCache(permissionable.getPermissionId());
    if ((bitPermissionsList == null) || (bitPermissionsList.isEmpty())) {
        bitPermissionsList = loadPermissions(permissionable);
    }
    if (!bitPermissions)
        return convertToNonBitPermissions(filterOnlyInheritablePermissions(bitPermissionsList, permissionable.getPermissionId()));
    else
        return filterOnlyInheritablePermissions(bitPermissionsList, permissionable.getPermissionId());
    
}
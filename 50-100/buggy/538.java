@java.lang.Override
protected java.util.List<com.dotmarketing.beans.Permission> getInheritablePermissions(com.dotmarketing.business.Permissionable permissionable, boolean bitPermissions) throws com.dotmarketing.exception.DotDataException {
    java.util.List<com.dotmarketing.beans.Permission> bitPermissionsList = permissionCache.getPermissionsFromCache(permissionable.getPermissionId());
    if ((bitPermissionsList == null) || ((bitPermissionsList.size()) == 0)) {
        bitPermissionsList = loadPermissions(permissionable);
    }
    if (!bitPermissions)
        return convertToNonBitPermissions(filterOnlyInheritablePermissions(bitPermissionsList, permissionable.getPermissionId()));
    else
        return filterOnlyInheritablePermissions(bitPermissionsList, permissionable.getPermissionId());
    
}
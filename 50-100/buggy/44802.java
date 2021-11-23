@java.lang.Override
protected void addPermissionsToCache(com.dotmarketing.business.Permissionable permissionable) throws com.dotmarketing.exception.DotDataException {
    java.util.List<com.dotmarketing.business.Permission> bitPermissionsList = permissionCache.getPermissionsFromCache(permissionable.getPermissionId());
    if ((bitPermissionsList == null) || (bitPermissionsList.isEmpty())) {
        bitPermissionsList = loadPermissions(permissionable);
        permissionCache.addToPermissionCache(permissionable.getPermissionId(), bitPermissionsList);
    }
}
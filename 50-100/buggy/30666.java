public static boolean hasDataSourcePermission(java.lang.String userPermissions, com.serotonin.m2m2.vo.dataSource.DataSourceVO<?> ds) {
    if (com.serotonin.m2m2.vo.permission.Permissions.permissionContains(SuperadminPermissionDefinition.GROUP_NAME, userPermissions))
        return true;
    
    if (com.serotonin.m2m2.vo.permission.Permissions.permissionContains(ds.getEditPermission(), userPermissions))
        return true;
    else
        throw new com.serotonin.m2m2.vo.permission.PermissionException(("No permission to data source with xid: " + (ds.getXid())), null);
    
}
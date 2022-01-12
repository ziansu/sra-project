public static boolean hasDataPointReadPermission(java.lang.String userPermissions, com.serotonin.m2m2.vo.IDataPoint point) {
    if (com.serotonin.m2m2.vo.permission.Permissions.hasPermission(point.getReadPermission(), userPermissions))
        return true;
    
    java.lang.String dsPermission = new com.serotonin.m2m2.db.dao.DataSourceDao().getEditPermission(point.getDataSourceId());
    if (com.serotonin.m2m2.vo.permission.Permissions.permissionContains(dsPermission, userPermissions))
        return true;
    else
        throw new com.serotonin.m2m2.vo.permission.PermissionException(("No read permission to data point with xid: " + (point.getXid())), null);
    
}
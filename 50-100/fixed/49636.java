public boolean isDataSourceEnabled(java.lang.String xid) {
    com.serotonin.m2m2.vo.dataSource.DataSourceVO<?> vo = DataSourceDao.instance.getByXid(xid);
    if (vo == null)
        return false;
    else {
        if (com.serotonin.m2m2.vo.permission.Permissions.hasDataSourcePermission(permissions.getDataSourcePermissions(), vo))
            return vo.isEnabled();
        else
            return false;
        
    }
}
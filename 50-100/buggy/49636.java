public boolean isDataSourceEnabled(java.lang.String xid) {
    com.serotonin.m2m2.vo.dataSource.DataSourceVO<?> vo = DataSourceDao.instance.getByXid(xid);
    com.serotonin.m2m2.vo.permission.Permissions.hasDataSourcePermission(permissions.getDataSourcePermissions(), vo);
    if (vo == null)
        return false;
    else
        return vo.isEnabled();
    
}
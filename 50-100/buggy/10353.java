public javax.naming.Reference getDataSourceFactoryReference() throws org.wso2.carbon.datasource.core.exception.DataSourceException {
    if ((dataSourceFactoryReference) == null) {
        dataSourceFactoryReference = new javax.naming.Reference(org.wso2.carbon.datasource.rdbms.hikari.HikariRDBMSDataSource.JAVAX_DATASOURCE_CLASS, org.wso2.carbon.datasource.rdbms.hikari.HikariRDBMSDataSource.HIKARI_JNDI_FACTORY, null);
        java.util.Map<java.lang.String, java.lang.String> poolConfigMap = org.wso2.carbon.datasource.utils.DataSourceUtils.extractPrimitiveFieldNameValuePairs(this.config);
        poolConfigMap.forEach(( key, value) -> dataSourceFactoryReference.add(new javax.naming.StringRefAddr(key, value)));
    }
    return dataSourceFactoryReference;
}
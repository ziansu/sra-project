public javax.naming.Reference getDataSourceFactoryReference() throws org.wso2.carbon.datasource.core.exception.DataSourceException {
    java.util.Map<java.lang.String, java.lang.String> poolConfigMap = org.wso2.carbon.datasource.utils.DataSourceUtils.extractPrimitiveFieldNameValuePairs(this.config);
    poolConfigMap.forEach(( key, value) -> dataSourceFactoryReference.add(new javax.naming.StringRefAddr(key, value)));
    return dataSourceFactoryReference;
}
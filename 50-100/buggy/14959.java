public static io.ddf.datasource.SQLDataSourceDescriptor resolveSQL(java.util.HashMap<java.lang.String, java.lang.String> options) {
    java.lang.String sql = options.get("sqlCmd");
    java.lang.String namespace = io.ddf.datasource.DataSourceResolver.getOrDefault(options, "namespace", null);
    java.lang.String uriListStr = io.ddf.datasource.DataSourceResolver.getOrDefault(options, "uriListStr", null);
    java.lang.String uuidListStr = io.ddf.datasource.DataSourceResolver.getOrDefault(options, "uuidListStr", null);
    java.lang.String dataSource = io.ddf.datasource.DataSourceResolver.getOrDefault(options, "dataSource", null);
    return new io.ddf.datasource.SQLDataSourceDescriptor(sql, dataSource, namespace, uriListStr, uuidListStr);
}
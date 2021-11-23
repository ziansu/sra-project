public static io.ddf.datasource.JDBCDataSourceDescriptor resolveJDBC(java.util.Map<java.lang.String, java.lang.String> options) throws io.ddf.exception.DDFException {
    java.lang.String uri = options.get("uri");
    java.lang.String username = options.get("username");
    java.lang.String password = options.get("password");
    java.lang.String dbTable = options.get("dbTable");
    try {
        return new io.ddf.datasource.JDBCDataSourceDescriptor(uri, username, password, dbTable);
    } catch (java.net.URISyntaxException e) {
        throw new io.ddf.exception.DDFException(e);
    }
}
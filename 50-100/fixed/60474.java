public static java.lang.String getSchemaName(java.sql.Connection connection) throws java.sql.SQLException {
    java.lang.String schema = null;
    java.sql.DatabaseMetaData meta = connection.getMetaData();
    schema = org.dspace.core.ConfigurationManager.getProperty("db.schema");
    if (org.apache.commons.lang.StringUtils.isBlank(schema)) {
        java.lang.String dbType = org.dspace.storage.rdbms.DatabaseManager.findDbKeyword(meta);
        if (dbType.equals(DatabaseManager.DBMS_POSTGRES)) {
            schema = "public";
        }else
            if (dbType.equals(DatabaseManager.DBMS_ORACLE)) {
                schema = meta.getUserName();
            }else
                schema = null;
            
        
    }
    return schema;
}
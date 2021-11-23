public static java.lang.String getDbType(java.sql.Connection connection) throws java.sql.SQLException {
    java.sql.DatabaseMetaData meta = connection.getMetaData();
    java.lang.String prodName = meta.getDatabaseProductName();
    java.lang.String dbms_lc = prodName.toLowerCase(java.util.Locale.ROOT);
    if (dbms_lc.contains("postgresql")) {
        return org.dspace.storage.rdbms.DatabaseUtils.DBMS_POSTGRES;
    }else
        if (dbms_lc.contains("oracle")) {
            return org.dspace.storage.rdbms.DatabaseUtils.DBMS_ORACLE;
        }else
            if (dbms_lc.contains("h2")) {
                return org.dspace.storage.rdbms.DatabaseUtils.DBMS_H2;
            }else {
                return null;
            }
        
    
}
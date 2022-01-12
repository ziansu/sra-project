private boolean checkTableExists(java.sql.Connection conn, java.lang.String targetTableName) throws java.sql.SQLException {
    boolean bTableExists = false;
    java.sql.DatabaseMetaData dbm = null;
    java.sql.ResultSet tables = null;
    try {
        dbm = conn.getMetaData();
        tables = dbm.getTables(null, null, targetTableName.toLowerCase(), null);
        if (tables.next()) {
            bTableExists = true;
        }
    } finally {
        eu.unifiedviews.plugins.loader.relationaltosql.RelationalToSqlHelper.tryCloseResultSet(tables);
    }
    return bTableExists;
}
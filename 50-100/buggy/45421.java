public static java.lang.String getUniqueEmptySqliteDBFile() throws java.io.IOException, java.lang.ClassNotFoundException, java.sql.SQLException {
    java.lang.String dbFile = org.smartdata.server.metastore.TestDBUtil.getUniqueDBFilePath();
    java.sql.Connection conn = null;
    try {
        conn = org.smartdata.server.metastore.MetaUtil.createSqliteConnection(dbFile);
        org.smartdata.server.metastore.MetaUtil.initializeDataBase(conn);
        return dbFile;
    } finally {
        if (conn != null) {
            conn.close();
        }
        java.io.File file = new java.io.File(dbFile);
        file.deleteOnExit();
    }
}
private static void initDatabase() throws java.lang.Exception {
    java.sql.Connection conn = org.apache.eagle.storage.jdbc.conn.ConnectionManagerFactory.getInstance().getConnection();
    java.sql.Statement stmt = conn.createStatement();
    java.lang.String ddl = org.apache.commons.io.FileUtils.readFileToString(new java.io.File(org.apache.eagle.storage.jdbc.TestJdbcStorage.class.getResource(org.apache.eagle.storage.jdbc.TestJdbcStorage.DDL_SQL_RESOURCE).getPath()));
    org.apache.eagle.storage.jdbc.TestJdbcStorage.LOG.info((ddl + "\n"));
    stmt.execute(ddl);
}
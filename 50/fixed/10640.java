public java.sql.DatabaseMetaData getDbMetaData() {
    try {
        return com.facebook.presto.hdfs.jdbc.JDBCDriver.connection.getMetaData();
    } catch (java.sql.SQLException e) {
        com.facebook.presto.hdfs.jdbc.JDBCDriver.log.error(e, "get metadata error");
        shutdown();
    }
    return null;
}
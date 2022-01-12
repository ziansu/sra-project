public static ftldb.DBQueryExecutor.QueryResult processResultSet(java.sql.ResultSet rs) throws java.sql.SQLException {
    try {
        java.sql.ResultSetMetaData rsmd = rs.getMetaData();
        int colCount = rsmd.getColumnCount();
        java.util.List colMetaList = new java.util.ArrayList(colCount);
        for (int i = 1; i <= colCount; i++) {
            ftldb.DBQueryExecutor.ColumnMetaData cmd = new ftldb.DBQueryExecutor.ColumnMetaData(rsmd, i);
            colMetaList.add(cmd);
        }
        return new ftldb.DBQueryExecutor.QueryResult(colMetaList, rs);
    } finally {
        rs.close();
    }
}
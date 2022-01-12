public static java.sql.ResultSet queryLessLastRecord(java.sql.Statement statement, java.lang.String table, java.lang.String orderBy, java.lang.String startValue, int limit) throws java.sql.SQLException {
    java.lang.String sql = java.lang.String.format(util.DBUtil.QUERY_LESS_LAST_RECORD, table, orderBy, startValue, orderBy, limit);
    java.sql.ResultSet resultSet = statement.executeQuery(sql);
    resultSet.next();
    return resultSet;
}
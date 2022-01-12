public static java.sql.ResultSet Query(java.lang.String sql) {
    try {
        java.sql.Statement statement = hit.weibo.persistence.database.MySQLConnection.conn.createStatement();
        java.sql.ResultSet resultSet = statement.executeQuery(sql);
        statement.close();
        return resultSet;
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println(e.getMessage());
    }
    return null;
}
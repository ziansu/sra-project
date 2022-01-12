@java.lang.Override
public int getCount() throws java.io.IOException, java.lang.ClassNotFoundException, java.sql.SQLException {
    java.sql.Connection connection = operationManager.setConnection();
    java.lang.String sql = "SELECT COUNT(*) FROM  ORDERS";
    java.sql.ResultSet resultSet = operationManager.getResultSet(connection, sql);
    resultSet.next();
    int count = java.lang.Integer.parseInt(resultSet.getString(1));
    operationManager.closeConnection();
    return count;
}
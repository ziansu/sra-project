@java.lang.Override
public int deleteTestById(java.lang.Long id) throws java.sql.SQLException {
    java.sql.Connection connection = null;
    java.sql.PreparedStatement preparedStatement = null;
    try {
        connection = connectionHelper.getConnection();
        preparedStatement = connection.prepareStatement(("DELETE FROM test" + " WHERE test_id = ?;"));
        preparedStatement.setLong(1, id);
        preparedStatement.setLong(2, id);
        return preparedStatement.executeUpdate();
    } finally {
        connectionHelper.close(preparedStatement);
        connectionHelper.close(connection);
    }
}
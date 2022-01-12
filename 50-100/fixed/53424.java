private void disconnect(java.sql.Connection connection, java.sql.PreparedStatement preparedStatement, java.sql.ResultSet resultSet) throws richk.RMS.database.DatabaseException {
    try {
        resultSet.close();
    } catch (java.sql.SQLException e) {
        throw new richk.RMS.database.DatabaseException(e);
    }
    try {
        preparedStatement.close();
    } catch (java.lang.Exception e) {
        throw new richk.RMS.database.DatabaseException(e);
    }
    try {
        connection.close();
    } catch (java.lang.Exception e) {
        throw new richk.RMS.database.DatabaseException(e);
    }
}
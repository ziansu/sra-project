public int deleteRecord(libraryDatabaseUtility.model.DataSource source, long bookId) throws java.sql.SQLException {
    int result = 0;
    java.sql.Connection connection = source.getConnection();
    java.sql.PreparedStatement statement = null;
    statement = connection.prepareStatement(libraryDatabaseUtility.repository.BookDAOImpl.DELETE_RECORD_SQL);
    statement.setLong(1, bookId);
    result = statement.executeUpdate();
    statement.close();
    connection.close();
    return result;
}
public int deleteRecord(libraryDatabaseUtility.model.DataSource source, long memberId) throws java.sql.SQLException {
    int result = 0;
    java.sql.PreparedStatement statement = null;
    java.sql.Connection connection = source.getConnection();
    statement = connection.prepareStatement(libraryDatabaseUtility.repository.MemberDAOImpl.DELETE_RECORD_SQL);
    statement.setLong(1, memberId);
    result = statement.executeUpdate();
    statement.close();
    connection.close();
    return result;
}
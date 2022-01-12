public int addBookToDb(libraryDatabaseUtility.model.DataSource source, libraryDatabaseUtility.model.Book book) throws java.sql.SQLException {
    int result = 0;
    java.sql.PreparedStatement statement = null;
    java.sql.Connection connection = source.getConnection();
    statement = connection.prepareStatement(libraryDatabaseUtility.repository.BookDAOImpl.INSERT_BOOK_SQL);
    statement.setString(1, book.getBookTitle());
    statement.setString(2, book.getBookAuthor());
    result = statement.executeUpdate();
    statement.close();
    connection.close();
    return result;
}
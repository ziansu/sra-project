@java.lang.Override
public java.sql.Statement createStatement(java.sql.Connection connection, int fetchSize) throws java.sql.SQLException {
    java.sql.Statement statement = connection.createStatement();
    statement.setFetchSize(fetchSize);
    return statement;
}
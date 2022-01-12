public java.sql.Statement getStatement() throws java.sql.SQLException {
    checkOpen();
    return statement;
}
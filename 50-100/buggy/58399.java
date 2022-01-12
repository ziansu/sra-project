protected void sqlExceptionLog(java.sql.SQLException e, java.sql.Statement statement) {
    logger.warning((((((("Couldn't execute sql query! SQL-Status: " + (e.getSQLState())) + "\n Message: ") + (e.getMessage())) + "\n SQL-Query: ") + (statement.toString())) + "\n"));
}
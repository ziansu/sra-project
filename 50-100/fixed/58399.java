protected void sqlExceptionLog(java.sql.SQLException e, java.sql.Statement statement) {
    if ((e != null) && (statement != null)) {
        logger.warning((((((("Couldn't execute sql query! SQL-Status: " + (e.getSQLState())) + "\n Message: ") + (e.getMessage())) + "\n SQL-Query: ") + (statement.toString())) + "\n"));
    }else
        if (e != null) {
            sqlExceptionLog(e);
        }
    
}
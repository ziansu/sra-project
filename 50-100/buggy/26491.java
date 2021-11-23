private java.sql.ResultSet executeQuery(java.lang.String sql) throws main.database.exceptions.DatabaseConnectionException, main.database.exceptions.DatabaseException {
    if (isOpen()) {
        try {
            return statement.executeQuery(sql);
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
            throw new main.database.exceptions.DatabaseException("Can't execute query.");
        }
    }else {
        throw new main.database.exceptions.DatabaseConnectionException("Not connected to database.");
    }
}
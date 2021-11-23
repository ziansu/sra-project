private void executeInsert(java.lang.String sql) throws database.exceptions.DatabaseConnectionException, database.exceptions.DatabaseException {
    if (isOpen()) {
        try {
            statement.executeUpdate(sql);
            con.commit();
        } catch (java.sql.SQLException e) {
            throw new database.exceptions.DatabaseException("Can't execute insert.");
        }
    }else {
        throw new database.exceptions.DatabaseConnectionException("Not connected to database.");
    }
}
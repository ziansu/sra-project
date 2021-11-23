public java.sql.Connection getConnection() {
    if (((connection) == null) || (!(check()))) {
        try {
            connection = factory.create();
        } catch (java.sql.SQLException e) {
            throw new java.lang.RuntimeException(e);
        }
    }
    return connection;
}
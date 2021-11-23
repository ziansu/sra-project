public java.sql.Connection getConnection() {
    try {
        return java.sql.DriverManager.getConnection(dbUrl, dbUser, dbPassword);
    } catch (java.sql.SQLException e) {
        throw new java.lang.RuntimeException(e);
    }
}
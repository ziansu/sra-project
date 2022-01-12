public java.sql.Connection getConnection() throws java.sql.SQLException {
    return java.sql.DriverManager.getConnection(dbUrl, dbUser, dbPassword);
}
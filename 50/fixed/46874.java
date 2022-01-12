java.sql.Connection getConnection() throws java.sql.SQLException {
    return java.sql.DriverManager.getConnection(url, username, password);
}
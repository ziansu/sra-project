boolean connect() throws java.sql.SQLException {
    conn = java.sql.DriverManager.getConnection(url);
    return true;
}
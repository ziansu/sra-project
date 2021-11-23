java.sql.Connection getConnection() throws java.sql.SQLException {
    java.lang.System.out.println(url);
    java.lang.System.out.println(username);
    return java.sql.DriverManager.getConnection(url, username, password);
}
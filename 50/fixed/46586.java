public java.sql.Connection getConnection() throws java.lang.ClassNotFoundException, java.lang.Exception, java.sql.SQLException {
    java.lang.Class.forName("com.mysql.jdbc.Driver");
    con = java.sql.DriverManager.getConnection(url, user, pass);
    return con;
}
public static java.sql.Connection getMySQLConnection() throws java.lang.ClassNotFoundException, java.sql.SQLException {
    java.lang.String userName = "root";
    java.lang.String password = "root";
    return com.database.MySQLConnUtils.getMySQLConnection(userName, password);
}
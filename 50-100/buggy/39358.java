public static boolean userExists(java.sql.Connection connection, pl.tripper.bean.User user) throws java.sql.SQLException {
    try {
        connection = pl.tripper.connection.MySQLConnUtils.getMySQLConnection();
        user = pl.tripper.util.DBUtils.findUser(connection, user.getUserName());
        if (user != null)
            return false;
        
    } catch (java.lang.ClassNotFoundException e) {
        e.printStackTrace();
    }
    return true;
}
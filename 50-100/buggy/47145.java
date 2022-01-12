private java.sql.Connection getConnection() throws com.gym.dao.exceptions.PersistException {
    java.util.Locale.setDefault(java.util.Locale.ENGLISH);
    java.sql.Connection con = null;
    try {
        con = java.sql.DriverManager.getConnection(url, user, password);
        con.setAutoCommit(false);
        return con;
    } catch (java.sql.SQLException e) {
        throw new com.gym.dao.exceptions.PersistException("Cannot obtain connection", e);
    }
}
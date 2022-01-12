public static boolean setAutoCommit(final java.sql.Connection connection, final boolean val) {
    if (connection == null)
        return false;
    
    try {
        connection.setAutoCommit(val);
        return true;
    } catch (java.sql.SQLException e) {
        utilities.Loggy.e(dao.SQLHelper.TAG, "setAutoCommit", e);
        return false;
    }
}
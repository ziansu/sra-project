private boolean setupConn() throws java.sql.SQLException {
    boolean res = false;
    setDb(pad, dName);
    try {
        conn = java.sql.DriverManager.getConnection(db);
        if ((conn) != null) {
            res = true;
        }
    } catch (java.sql.SQLException e) {
        throw new java.sql.SQLException(e);
    }
    return res;
}
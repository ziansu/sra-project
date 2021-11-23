public java.sql.ResultSet querySQL(java.lang.String query) {
    java.sql.Connection c = preCheckConnection();
    java.sql.Statement s = null;
    try {
        s = c.createStatement();
    } catch (java.sql.SQLException e1) {
        e1.printStackTrace();
    }
    java.sql.ResultSet ret = null;
    try {
        ret = s.executeQuery(query);
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return ret;
}
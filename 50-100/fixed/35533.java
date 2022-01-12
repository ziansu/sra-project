public boolean exists() {
    if ((connection) != null) {
        try {
            java.sql.Statement statement = connection.createStatement();
            statement.setQueryTimeout(util.Database.TIMEOUT);
            java.sql.ResultSet rs = statement.executeQuery("SELECT count(*) AS count FROM sqlite_master WHERE type='table' AND name='properties'");
            return (rs.getInt("count")) > 0;
        } catch (java.sql.SQLException e) {
            util.Log.err("SQL exception when checking if table exists", e);
        }
    }
    return false;
}
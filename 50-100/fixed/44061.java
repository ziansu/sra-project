public boolean add(int id, java.lang.String key, java.lang.String data) {
    if ((connection) != null) {
        try {
            java.sql.PreparedStatement statement = connection.prepareStatement("INSERT OR REPLACE INTO properties (id, key, data) VALUES(?,?,?)");
            statement.setQueryTimeout(util.Database.TIMEOUT);
            statement.setInt(1, id);
            statement.setString(2, key);
            statement.setString(3, data);
            statement.executeUpdate();
            return true;
        } catch (java.sql.SQLException e) {
            util.Log.err("SQL exception when creating table", e);
        }
    }
    return false;
}
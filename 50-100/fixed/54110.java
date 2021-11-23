public boolean create() {
    if ((connection) != null) {
        try {
            java.sql.Statement statement = connection.createStatement();
            statement.setQueryTimeout(util.Database.TIMEOUT);
            statement.executeUpdate("DROP TABLE IF EXISTS properties");
            statement.executeUpdate(("CREATE TABLE properties (" + ((("id INTEGER NOT NULL, " + "key TEXT NOT NULL, ") + "data TEXT NOT NULL, ") + "PRIMARY KEY (id, key))")));
            return true;
        } catch (java.sql.SQLException e) {
            util.Log.err("SQL exception when creating table", e);
        }
    }
    return false;
}
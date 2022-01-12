public void deleteFromDB(java.lang.String url) {
    java.sql.PreparedStatement statement;
    try {
        statement = com.database.Cleaner.db.connection.prepareStatement("SELECT recordid, url FROM record WHERE url=?");
        statement.setString(1, url);
        java.sql.ResultSet urlFromDB = statement.executeQuery();
        if (urlFromDB.next()) {
            statement = com.database.Cleaner.db.connection.prepareStatement("DELETE FROM record WHERE recordid=?");
            statement.setInt(1, urlFromDB.getInt("recordid"));
            statement.execute();
        }
    } catch (java.sql.SQLException e) {
        java.lang.System.err.println("Failed to query database");
        e.printStackTrace();
    }
}
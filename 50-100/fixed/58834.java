private void removeTable(java.lang.String tableName) {
    java.lang.String query = "drop table if exists " + tableName;
    try {
        statement.executeUpdate(query);
    } catch (java.sql.SQLException e) {
        com.CssServer.Database.logger.severe(("Error when removing the table " + tableName));
        e.printStackTrace();
    }
    return ;
}
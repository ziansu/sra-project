private void createTables() {
    try {
        java.lang.String sql = "CREATE TABLE IF NOT EXISTS CONFIG " + ("(ID TEXT PRIMARY KEY NOT NULL," + "DATA TEXT NOT NULL)");
        java.sql.Statement statement = c.createStatement();
        statement.executeUpdate(sql);
        statement.close();
    } catch (java.sql.SQLException e) {
        de.qabel.core.config.SQLitePersistence.logger.error("Cannot create CONFIG table!", e);
    }
}
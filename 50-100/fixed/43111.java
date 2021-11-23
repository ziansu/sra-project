private void createTables() {
    java.lang.String sql = "CREATE TABLE IF NOT EXISTS CONFIG " + ("(ID TEXT PRIMARY KEY NOT NULL," + "DATA TEXT NOT NULL)");
    try (java.sql.Statement statement = c.createStatement()) {
        statement.executeUpdate(sql);
    } catch (java.sql.SQLException e) {
        de.qabel.core.config.SQLitePersistence.logger.error("Cannot create CONFIG table!", e);
    }
}
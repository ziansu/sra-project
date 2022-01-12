@java.lang.Override
public boolean dropTable(java.lang.Class cls) {
    if (cls == null) {
        throw new java.lang.IllegalArgumentException("Arguments cannot be null!");
    }
    java.lang.String sql = (("DROP TABLE " + "\"") + (cls.getCanonicalName())) + "\"";
    try (java.sql.Statement statement = c.createStatement()) {
        statement.execute(sql);
    } catch (java.sql.SQLException e) {
        de.qabel.core.config.SQLitePersistence.logger.error(("Cannot drop table!" + e));
        return false;
    }
    return true;
}
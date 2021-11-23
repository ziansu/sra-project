@java.lang.Override
public boolean dropTable(java.lang.Class cls) {
    if (cls == null) {
        throw new java.lang.IllegalArgumentException("Arguments cannot be null!");
    }
    try {
        java.lang.String sql = (("DROP TABLE " + "\"") + (cls.getCanonicalName())) + "\"";
        java.sql.Statement statement = c.createStatement();
        statement.execute(sql);
        statement.close();
    } catch (java.sql.SQLException e) {
        de.qabel.core.config.SQLitePersistence.logger.error(("Cannot drop table!" + e));
        return false;
    }
    return true;
}
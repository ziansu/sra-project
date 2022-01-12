@java.lang.Override
public void removeTable(final java.lang.String tableName) throws java.sql.SQLException {
    logger.info(java.lang.String.format("Removing table for sid %d and tablename %s", getSid(), tableName));
    java.lang.String sql = java.lang.String.format("DROP TABLE IF EXISTS %s", wrapName(tableName));
    try {
        executeUpdate(sql);
    } catch (java.sql.SQLException e) {
        logger.error(java.lang.String.format("Removing table for sid %d and tablename %s FAILED", getSid(), tableName), e);
        throw e;
    }
}
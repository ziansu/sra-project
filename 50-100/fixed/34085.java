@java.lang.Override
public void createTableFromTable(final java.lang.String tableNameToCreate, final java.lang.String tableNameFromWhichToCreate) throws java.sql.SQLException {
    final java.lang.String message = java.lang.String.format("Creating table %s from %s for sid %d", tableNameToCreate, tableNameFromWhichToCreate, getSid());
    this.logger.info(message);
    final java.lang.String sql = java.lang.String.format("CREATE TABLE %s SELECT * FROM %s", wrapName(tableNameToCreate), wrapName(tableNameFromWhichToCreate));
    try {
        executeUpdate(sql);
    } catch (final java.sql.SQLException e) {
        this.logger.error(("FAILED " + message), e);
        throw e;
    }
}
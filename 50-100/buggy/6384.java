@java.lang.Override
public void importCsvToTable(final java.lang.String dir, final java.lang.String tableName) throws java.sql.SQLException {
    java.lang.String message = java.lang.String.format("Importing from %s to table %s", dir, tableName);
    logger.info(message);
    java.lang.String sql = java.lang.String.format("LOAD DATA LOCAL INFILE \'%s\' into table %s  fields terminated by \',\'  optionally enclosed by \'\"\' escaped by \'\"\' lines terminated by \'\\r\\n\'", dir, wrapName(tableName));
    try {
        executeUpdate(sql);
    } catch (java.sql.SQLException e) {
        logger.error(("FAILED " + message), e);
        throw e;
    }
}
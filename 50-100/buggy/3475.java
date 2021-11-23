private java.sql.ResultSet queryForColumnsInFactTable(java.sql.DatabaseMetaData dmd) throws java.sql.SQLException {
    java.lang.String[] tableNameParts = factTable.split("\\.");
    fi.thl.pivot.datasource.JDBCSource.LOG.debug(("Fetching metadata for table " + (com.google.common.collect.Lists.newArrayList(tableNameParts))));
    return dmd.getColumns(null, (isSchemaDefined(tableNameParts) ? tableNameParts[0] : ""), (isSchemaDefined(tableNameParts) ? tableNameParts[1] : tableNameParts[0]), null);
}
private static com.googlecode.paradox.metadata.ParadoxTable getTable(final com.googlecode.paradox.ParadoxConnection conn, final java.lang.String tableName) throws java.sql.SQLException {
    final java.util.ArrayList<com.googlecode.paradox.metadata.ParadoxTable> tables = com.googlecode.paradox.data.TableData.listTables(conn, tableName.trim());
    if (!(tables.isEmpty())) {
        return tables.get(0);
    }
    throw new java.sql.SQLException((("Table " + tableName) + " not found"));
}
@java.lang.Override
public boolean checkDocument(java.lang.String file) {
    resetAttributes();
    boolean checked = false;
    try {
        openConnection();
        resultSet = this.statement.executeQuery(java.lang.String.format("select %s from %s where %s = '%s';", DataConstants.DOCUMENTS_TABLE_ID_COLUMN, DataConstants.DOCUMENTS_TABLE, DataConstants.DOCUMENTS_TABLE_NAME_COLUMN, file));
        checked = resultSet.next();
    } catch (java.sql.SQLException ex) {
        java.lang.System.err.println(ex.getMessage());
        checked = false;
    } finally {
        closeConnection();
    }
    return checked;
}
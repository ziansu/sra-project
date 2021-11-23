public boolean getBoolean(java.lang.String columnLabel) throws java.sql.SQLException {
    return ((java.lang.Boolean) (currentRow[columnList.indexOf(columnLabel)]));
}
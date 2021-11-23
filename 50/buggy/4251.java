public boolean getBoolean(java.lang.String columnLabel) throws java.sql.SQLException {
    return java.lang.Boolean.valueOf(((java.lang.String) (currentRow[columnList.indexOf(columnLabel)])));
}
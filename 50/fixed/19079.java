public long getLong(java.lang.String columnLabel) throws java.sql.SQLException {
    return ((java.lang.Long) (currentRow[columnList.indexOf(columnLabel)]));
}
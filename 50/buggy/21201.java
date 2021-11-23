public long getLong(int columnIndex) throws java.sql.SQLException {
    return java.lang.Long.parseLong(((java.lang.String) (currentRow[columnIndex])));
}
public boolean getBoolean(int columnIndex) throws java.sql.SQLException {
    return java.lang.Boolean.valueOf(((java.lang.String) (currentRow[columnIndex])));
}
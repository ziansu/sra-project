public double getDouble(java.lang.String columnLabel) throws java.sql.SQLException {
    return java.lang.Double.parseDouble(((java.lang.String) (currentRow[columnList.indexOf(columnLabel)])));
}
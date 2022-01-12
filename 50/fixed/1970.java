public double getDouble(java.lang.String columnLabel) throws java.sql.SQLException {
    return ((java.lang.Double) (currentRow[columnList.indexOf(columnLabel)]));
}
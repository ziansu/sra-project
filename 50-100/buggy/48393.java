private void listDimensionKeyColumnsInTable(java.util.List<java.lang.String> dimensionColumns, java.sql.ResultSet rs) throws java.sql.SQLException {
    while (rs.next()) {
        fi.thl.pivot.datasource.JDBCSource.LOG.debug(java.lang.String.format("Column '%s' detected in fact table", rs.getString("COLUMN_NAME")));
        if (rs.getString("COLUMN_NAME").endsWith("_key")) {
            dimensionColumns.add(rs.getString("COLUMN_NAME"));
        }
    } 
    fi.thl.pivot.datasource.JDBCSource.LOG.debug("All columns processed");
}
public int getIndexFromColumnLabel(java.lang.String col) throws java.sql.SQLException {
    int index = colLabels.indexOf(col);
    if (index == (-1)) {
        throw new java.sql.SQLException(java.lang.String.format("column '%s' is not found in results", col));
    }
    return index + 1;
}
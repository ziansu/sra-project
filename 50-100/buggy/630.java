public java.lang.String getColumnName(int columnIndex) {
    if (((columnNames) != null) && ((columnNames.length) > 0)) {
        if ((columnIndex >= 0) && (columnIndex < (columnNames.length))) {
            return columnNames[columnIndex];
        }
    }
    return null;
}
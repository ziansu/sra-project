public java.lang.Object getValueAt(int row, int column) {
    java.awt.List rowData = ((java.awt.List) (tableData.get(row)));
    return rowData.get(column);
}
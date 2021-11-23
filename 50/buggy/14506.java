public boolean delete(java.lang.Object o) {
    int row = findRow(o);
    if (row != (-1)) {
        delete(row);
        fireTableRowsDeleted(row, row);
    }
    return row != (-1);
}
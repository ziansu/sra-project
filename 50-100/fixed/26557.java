public void removeRow(int rowIndex) {
    if ((rowIndex < 0) || (rowIndex >= (rows.size()))) {
        return ;
    }
    rows.remove(rowIndex);
    ciRows.remove(rowIndex);
    dmRows.remove(rowIndex);
    removeFromMap(containsRows, rowIndex);
    removeFromMap(containsCiRows, rowIndex);
    removeFromMap(containsDmRows, rowIndex);
    containsCache.clear();
    dmCache.clear();
}
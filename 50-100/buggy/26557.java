public void removeRow(int rowIndex) {
    rows.remove(rowIndex);
    ciRows.remove(rowIndex);
    dmRows.remove(rowIndex);
    removeFromMap(containsRows, rowIndex);
    removeFromMap(containsCiRows, rowIndex);
    removeFromMap(containsDmRows, rowIndex);
    containsCache.clear();
    dmCache.clear();
}
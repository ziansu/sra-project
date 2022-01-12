public void removeRow() {
    final int categorySize = getColumnCount();
    final int rowCount = getRowCount();
    if (rowCount >= 0) {
        for (int categoryIndex = 0; categoryIndex < categorySize; categoryIndex++)
            deleteClueAt(categoryIndex, (rowCount - 1));
        
    }
    dispatchRowCountUpdate(getRowCount());
}
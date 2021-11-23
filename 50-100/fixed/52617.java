public void deselect() {
    int selectedRow = getSelectedRow();
    int selectedColumn = getSelectedColumn();
    if ((selectedRow >= 0) || (selectedColumn >= 0)) {
        changeSelection(selectedRow, getColumnCount(), false, false);
        clearSelection();
        if ((getCellEditor()) != null)
            getCellEditor().cancelCellEditing();
        
    }
}
private void cancelButtonTableCellPopupActionPerformed(java.awt.event.ActionEvent evt) {
    windowClose();
    setProjectManagerFunction(true);
    selectedTable.getComponentAt(selectedRow, selectedColumn).requestFocus();
}
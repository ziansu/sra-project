public void performOnRange(int firstIndex, int lastIndex) {
    javax.swing.ListSelectionModel selectionModel = tablePositions.getSelectionModel();
    selectionModel.addSelectionInterval(firstIndex, lastIndex);
    slash.navigation.gui.helpers.JTableHelper.scrollToPosition(tablePositions, firstIndex);
}
public void performOnRange(int firstIndex, int lastIndex) {
    javax.swing.ListSelectionModel selectionModel = tablePositions.getSelectionModel();
    selectionModel.addSelectionInterval(firstIndex, lastIndex);
    scrollToPosition(tablePositions, firstIndex);
}
public void run() {
    int[] selectedRows = tablePositions.getSelectedRows();
    if ((selectedRows.length) > 0) {
        getPositionsModel().up(selectedRows, 1);
        selectPositions(slash.navigation.gui.events.Range.increment(selectedRows, (-1)));
    }
}
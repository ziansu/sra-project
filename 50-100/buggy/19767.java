public void run() {
    int[] selectedRows = tablePositions.getSelectedRows();
    if ((selectedRows.length) > 0) {
        getPositionsModel().down(selectedRows, 1);
        selectPositions(slash.navigation.gui.events.Range.increment(selectedRows, (+1)));
    }
}
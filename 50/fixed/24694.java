public void setGridEnabled(boolean gridEnabled) {
    this.gridEnabled = gridEnabled;
    if (gridEnabled) {
        updateGrid();
    }else {
        removeGrid();
    }
}
public void setGridEnabled(boolean gridEnabled) {
    this.gridEnabled = gridEnabled;
    if (gridEnabled) {
        gridCenterLast = null;
        updateGrid();
    }else {
        removeGrid();
    }
}
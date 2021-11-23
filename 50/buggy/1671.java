void undo() {
    if (committed) {
        return ;
    }
    commit();
    grid = backupGrid;
    widthOfRows = backupWidthOfRows;
    heightOfColumes = backupHeightOfColumes;
    maxHeight = backupMaxHeight;
    sanityCheck();
}
void undo() {
    if (committed) {
        return ;
    }
    grid = backupGrid;
    widthOfRows = backupWidthOfRows;
    heightOfColumes = backupHeightOfColumes;
    maxHeight = backupMaxHeight;
    commit();
    sanityCheck();
}
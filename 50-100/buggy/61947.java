public SmartGrid.PVector getCellSize(int col, int row, boolean isRelative) {
    updateLayout();
    SmartGrid.PVector result = cellSize[row][col].copy();
    if (isRelative) {
        result.set(((result.x) * (projectScale.x)), ((result.y) * (projectScale.y)));
    }
    return result;
}
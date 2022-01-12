public SmartGrid.PVector getCellPosition(int col, int row, boolean isRelative) {
    updateLayout();
    SmartGrid.PVector result = cellPosition[row][col].copy();
    if (isRelative) {
        result.set(((result.x) * (projectScale.x)), ((result.y) * (projectScale.y)));
    }else {
        result.add(position);
    }
    return result;
}
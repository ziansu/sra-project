public SmartGrid.PVector getCellPosition(int row, int col, boolean isRelative) {
    updateLayout();
    SmartGrid.PVector result = cellPosition[row][col].copy();
    if (isRelative) {
        result.set(((result.x) * (projectScale.x)), ((result.y) * (projectScale.y)));
    }else {
        result.add(position);
    }
    return result;
}
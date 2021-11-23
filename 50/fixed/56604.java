public SmartGrid.SmartGrid CreateGrid(SmartGrid.SmartGrid parent, int row, int col, int rowSpan, int colSpan) {
    SmartGrid.SmartGrid result = CreateGrid("*", "*");
    result.setParent(parent, row, col, rowSpan, colSpan);
    return result;
}
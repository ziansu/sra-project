public boolean isRowGroupCollapsed(int row) {
    int collapseRow = (findEndOfRowOutlineGroup(row)) + 1;
    return ((getRow(collapseRow)) != null) && (getRow(collapseRow).getColapsed());
}
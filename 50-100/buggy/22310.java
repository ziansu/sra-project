public void setParent(SmartGrid.SmartGrid p, int column, int row, int columnSpan, int rowSpan) {
    if ((parent) != null) {
        parent.children.remove(this);
    }
    parent = p;
    parent.children.add(this);
    this.pCol = column;
    this.pRow = row;
    this.pColSpan = columnSpan;
    this.pRowSpan = rowSpan;
    isDirty = true;
}
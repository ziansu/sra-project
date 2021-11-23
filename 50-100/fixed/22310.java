public void setParent(SmartGrid.SmartGrid p, int row, int column, int rowSpan, int columnSpan) {
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
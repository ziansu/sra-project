public void setRows(int rows) {
    this.rows = rows;
    requestLayout();
    invalidate();
}
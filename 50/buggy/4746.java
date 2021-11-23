public void setLines(int lines) {
    this.lines = lines;
    requestLayout();
    invalidate();
}
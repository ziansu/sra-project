public void updateView(int dX, int dY) {
    this.viewport = createShiftedViewport(viewDelta, numRows, numCols);
    drawViewport();
}
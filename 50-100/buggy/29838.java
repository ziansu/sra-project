public void changeZoom(int column, int radius) {
    this.radius = radius;
    zoomLevel = (columnWidths[((column + radius) + 1)]) - (columnWidths[(column - radius)]);
    moveShapes(columnWidths[(column - radius)]);
}
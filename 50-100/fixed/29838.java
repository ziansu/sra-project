public void changeZoom(int column, int radius) {
    this.radius = (radius + radius) + 1;
    zoomLevel = (columnWidths[((column + radius) + 1)]) - (columnWidths[(column - radius)]);
    moveShapes(columnWidths[(column - radius)]);
}
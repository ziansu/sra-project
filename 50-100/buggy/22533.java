public void cellCoordinateToPixels(final thesis.core.common.CellCoordinate cc, final java.awt.Point pixels) {
    int pixelX = ((gridCellW) * (cc.getRow())) + ((gridCellW) / 2);
    int pixelY = (bounds.height) - (((gridCellH) * (cc.getColumn())) + ((gridCellH) / 2));
    pixels.setLocation(pixelX, pixelY);
}
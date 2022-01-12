public void cellCoordinateToPixels(final thesis.core.common.CellCoordinate cc, final java.awt.Point pixels) {
    int pixelX = ((gridCellW) * (cc.getColumn())) + ((gridCellW) / 2);
    int pixelY = (bounds.height) - (((gridCellH) * (cc.getRow())) + ((gridCellH) / 2));
    pixels.setLocation(pixelX, pixelY);
}
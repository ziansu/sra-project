public void renderTiles(Model.Tile[] tiles) {
    screen.clear();
    int drawn = 0;
    for (Model.Tile tile : tiles) {
        if ((tile != null) && (screen.isInsideDisplay(tile, tile.getImagePosition(), tile.getImagePosition()))) {
        }
    }
    java.lang.System.out.println(drawn);
    panel.repaint();
}
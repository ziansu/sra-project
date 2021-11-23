public void renderTiles(Model.Tile[] tiles) {
    screen.clear();
    int drawn = 0;
    for (Model.Tile tile : tiles) {
        if ((tile != null) && (screen.isInsideDisplay(tile))) {
        }
    }
    java.lang.System.out.println(drawn);
    panel.repaint();
}
private void changeTiles() {
    attrs = bdzimmer.pixeleditor.model.TileOptions.getOptions();
    tileset = bdzimmer.pixeleditor.controller.OldTilesetLoader.fromAttributes(attrs);
    graphicsPanel.remove(dosGraphics);
    dosGraphics = createDosGraphics();
    graphicsPanel.add(dosGraphics);
    pack();
    repaint();
}
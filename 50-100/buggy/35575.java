private void changeTiles() {
    attrs = bdzimmer.pixeleditor.model.TileOptions.getOptions();
    tileset = bdzimmer.pixeleditor.controller.OldTilesetLoader.fromAttributes(attrs);
    int[][] rgbPalette = dosGraphics.getRgbPalette();
    graphicsPanel.remove(dosGraphics);
    dosGraphics = createDosGraphics();
    dosGraphics.setRgbPalette(rgbPalette);
    graphicsPanel.add(dosGraphics);
    pack();
    repaint();
}
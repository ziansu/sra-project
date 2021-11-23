private void setupTileset() {
    FruitEditor.Tileset tileset = tilePanel.getTileset();
    tilePanel.setTileset(new FruitEditor.Tileset(tileset.getTilesetPath(), gridWidth, gridHeight, offsetX, offsetY, paddingV, paddingH), true);
    dispose();
}
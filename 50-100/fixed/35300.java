private int pixelsPerRow() {
    int defaultPixPerRow = (com.github.sesquipedalian_dev.snes_graphics_edit.ui.TileCharacterCanvasController.TILES_PER_ROW) * (com.github.sesquipedalian_dev.snes_graphics_edit.data.TileCHR.TILE_DIM);
    switch (zoomSel.getSelectionModel().getSelectedIndex()) {
        case 1 :
            return defaultPixPerRow / 4;
        case 2 :
            return defaultPixPerRow / 8;
        case 3 :
            return defaultPixPerRow / 16;
        default :
            return defaultPixPerRow / 2;
    }
}
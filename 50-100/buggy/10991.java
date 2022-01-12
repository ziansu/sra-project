public int selectColor(int x, int y, int color) {
    if ((((x >= (com.github.sesquipedalian_dev.snes_graphics_edit.data.TileCHR.TILE_DIM)) || (y >= (com.github.sesquipedalian_dev.snes_graphics_edit.data.TileCHR.TILE_DIM))) || (x < 0)) || (y < 0)) {
        throw new java.lang.IndexOutOfBoundsException((("Pick a position within 0 < POSITION < TILE_DIM: " + (com.github.sesquipedalian_dev.snes_graphics_edit.data.TileCHR.TILE_DIM)) + "\n"));
    }
    int trueColor = (color - 1) % (1 << (bitDepth));
    colorSelected[x][y] = trueColor;
    return trueColor;
}
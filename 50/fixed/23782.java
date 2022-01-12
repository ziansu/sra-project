public wraith.library.WorldManagement.TileGrid.TileMaterial getTileMaterial(int x, int y) {
    return materials[((y * (cols)) + x)];
}
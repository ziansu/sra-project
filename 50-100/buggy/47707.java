public boolean hasTileAt(int x, int y) {
    if ((((x >= 0) && (x < (tile.length))) && (y >= 0)) && (y < (tile[0].length))) {
        return true;
    }
    return false;
}
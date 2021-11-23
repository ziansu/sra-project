public boolean hasTileAt(int x, int y) {
    if ((((x >= 0) && (x < (tile[0].length))) && (y >= 0)) && (y < (tile.length))) {
        return true;
    }
    return false;
}
public void remove(int x, int y) {
    for (int i = 0; i < (tiles.size()); i++) {
        com.trisse.spacerouge.entities.tile.Tile t = tiles.get(i);
        if (((t.x) == x) && ((t.y) == y)) {
            tiles.remove(i);
        }
    }
}
public void remove(int x, int y) {
    for (int i = 0; i < (tiles.size()); i++) {
        com.trisse.spacerouge.entities.tile.Tile t = tiles.get(i);
        if (((t.xpos()) == x) && ((t.ypos()) == y)) {
            tiles.remove(i);
        }
    }
}
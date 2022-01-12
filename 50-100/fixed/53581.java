public void render(com.trisse.spacerouge.graphics.Screen screen, int xoffset, int yoffset) {
    for (com.trisse.spacerouge.entities.tile.Tile t : tiles) {
        int x = (t.x) - xoffset;
        if ((x < 46) && (x >= 0)) {
            int y = (t.y) - yoffset;
            if ((y >= 0) && (y < (com.trisse.spacerouge.graphics.Screen.tileHeight)))
                screen.draw(t.getSprite(), x, y, 0);
            
        }
    }
}
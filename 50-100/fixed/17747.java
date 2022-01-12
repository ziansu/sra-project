public void draw(java.awt.Graphics2D g2d) {
    for (int y = 0; y < (com.palmstudios.system.Map.MAP_HEIGHT); y++) {
        for (int x = 0; x < (com.palmstudios.system.Map.MAP_WIDTH); x++) {
            map[x][y].draw(g2d, x, y);
        }
    }
}
void draw(java.awt.Graphics2D g2d) {
    for (int x = 0; x < (com.palmstudios.system.Map.MAP_WIDTH); x++) {
        for (int y = 0; y < (com.palmstudios.system.Map.MAP_HEIGHT); y++) {
            map[x][y].draw();
        }
    }
}
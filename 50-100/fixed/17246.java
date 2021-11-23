public void draw(java.awt.Graphics2D g) {
    int blockSize = size;
    for (int x = 0; x < (map.length); x++) {
        for (int y = 0; y < (map[0].length); y++) {
            map[x][y].draw(g, ((x * blockSize) + (viewPosition.x)), ((y * blockSize) + (viewPosition.y)), blockSize);
        }
    }
}
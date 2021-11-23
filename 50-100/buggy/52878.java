public void paintComponent(java.awt.Graphics2D g) {
    int count = 0;
    for (int i = 0; i < (maxY); i++) {
        for (int j = 0; j < (maxX); j++) {
            tiles[j][i].paintComponent(g);
        }
    }
}
public void paintBlocks(java.awt.Graphics g) {
    int blockNum = 0;
    for (int i = 0; i <= (getWidth()); i += 100) {
        if (redBlock[blockNum]) {
            g.setColor(brick);
            g.fillRect(i, 0, 50, 50);
        }
        blockNum++;
        g.setColor(java.awt.Color.white);
    }
}
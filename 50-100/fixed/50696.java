public void draw(java.awt.Graphics g, Utilities.DeciduousTileManager manager, int x, int y) {
    g.drawImage(manager.getImage(this), (x * (Stage.BLOCK_SIZE)), (1 + (y * (Stage.BLOCK_SIZE))), null);
}
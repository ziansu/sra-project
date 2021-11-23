public void spawnSouth(int offX, int offY, int height) {
    java.awt.Graphics2D s2d = backImage.createGraphics();
    s2d.drawImage(this.getSouth(), (offX - ((this.getSouth().getWidth()) / 2)), offY, this.getSouth().getWidth(), height, null);
    updateGeneratedImage();
}
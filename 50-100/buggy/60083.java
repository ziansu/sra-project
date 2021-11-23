public void drawBackground(java.awt.Graphics2D g2) {
    int width = this.getHeight();
    int height = this.getHeight();
    for (int i = 0; i < width; i += background.getWidth()) {
        for (int j = 0; j < height; j += background.getHeight()) {
            g2.drawImage(background, i, j, this);
        }
    }
}
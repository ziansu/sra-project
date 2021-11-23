public void drawCowboy(java.awt.Graphics g, java.awt.image.BufferedImage image) {
    Cowboy.cowboy = image;
    g.drawImage(Cowboy.cowboy, Cowboy.body.x, Cowboy.body.y, null);
}
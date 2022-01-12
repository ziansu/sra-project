public void paint(final java.awt.Graphics g) {
    g.setColor(color);
    g.fillRect(x, y, WIDTH, HEIGHT);
    g.drawImage(breakout.Brick.brickImages[((special) + 1)], x, y, null);
}
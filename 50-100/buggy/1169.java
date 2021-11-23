private void drawButton(int x, int y, java.lang.String text, java.awt.Font font, java.awt.Graphics g) {
    g.setFont(font);
    g.setColor(java.awt.Color.GREEN);
    g.drawString(text, (x + 130), (y + 38));
    g.setColor(java.awt.Color.RED);
    g.drawRect(x, y, 300, 64);
}
private void paintWorld(java.awt.Graphics2D g) {
    g.setColor(new java.awt.Color(100, 100, 100));
    int x = 0;
    if (x < 0) {
        x = 0;
    }
    g.drawImage(scaledBackground, (x / 2), 0, this);
    g.drawImage(scaledForeground, (x / 2), 0, this);
}
private void paintWorld(java.awt.Graphics2D g) {
    g.setColor(new java.awt.Color(100, 100, 100));
    g.drawImage(scaledBackground, 0, 0, this);
    g.drawImage(scaledForeground, 0, 0, this);
}
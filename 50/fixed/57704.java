protected void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    g.setColor(java.awt.Color.orange);
    g.fillRect(((int) (playerX)), ((int) (playerY)), 25, 25);
}
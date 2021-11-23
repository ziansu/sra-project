@java.lang.Override
public void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    g.drawImage(bg, 0, 0, null);
    ball.draw(g, this);
}
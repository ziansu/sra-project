@java.lang.Override
protected void paintComponent(java.awt.Graphics g) {
    if (g != null) {
        super.paintComponent(g);
        g.clearRect(0, 0, getWidth(), getHeight());
        game.draw(g);
    }
}
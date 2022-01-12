public void paint(java.awt.Graphics2D g2) {
    g2.setColor(board.getBackground());
    g2.drawRect(x, y, WIDTH, HEIGHT);
    g2.setColor(board.getForeground());
    g2.fillRect(x, y, ((WIDTH) - 2), ((HEIGHT) - 2));
}
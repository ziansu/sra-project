public void drawSelection(java.awt.Graphics g) {
    g.setColor(java.awt.Color.green);
    g.drawRect(x_position, y_position, width, ((height) - 1));
}
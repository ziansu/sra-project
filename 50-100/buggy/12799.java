public void paint(java.awt.Graphics g) {
    g.setColor(java.awt.Color.BLACK);
    g.fillOval(((x) + ((range) / 2)), ((y) + ((range) / 2)), radius, radius);
    g.drawOval(x, y, range, range);
}
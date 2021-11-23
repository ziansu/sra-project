public void paint(java.awt.Graphics g) {
    g.setColor(java.awt.Color.BLACK);
    g.fillOval(x, y, radius, radius);
    g.drawOval((((x) + ((radius) / 2)) - ((range) / 2)), (((y) + ((radius) / 2)) - ((range) / 2)), range, range);
}
@java.lang.Override
public void draw(java.awt.Graphics g) {
    java.awt.Graphics2D g2 = ((java.awt.Graphics2D) (g));
    g2.setStroke(new java.awt.BasicStroke(thickness));
    g.setColor(color);
    if (first) {
        x2 = x1;
        y2 = y1;
        first = false;
    }
    g.drawLine(x1, y1, x2, y2);
}
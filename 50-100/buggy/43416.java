@java.lang.Override
protected void paintComponent(java.awt.Graphics g) {
    g.setColor(c);
    g.fillPolygon(xPoints, yPoints, 3);
    setBounds(x, y, 30, 30);
    if (p.isMarked()) {
        g.setColor(java.awt.Color.RED);
        g.drawRect(0, 0, (30 - 1), (30 - 1));
    }
}
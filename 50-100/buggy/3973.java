public void draw(java.awt.Graphics2D g2, boolean filled) {
    java.awt.geom.Ellipse2D.Double cir = new java.awt.geom.Ellipse2D.Double(getRadius(), getRadius(), getCenter().getX(), getCenter().getY());
    g2.setColor(java.awt.Color.RED);
    if (filled = true) {
        g2.draw(cir);
        g2.fill(cir);
    }else {
        g2.draw(cir);
    }
}
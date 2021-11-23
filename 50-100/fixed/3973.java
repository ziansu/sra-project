public void draw(java.awt.Graphics2D g2, boolean filled) {
    java.awt.geom.Ellipse2D.Double cir = new java.awt.geom.Ellipse2D.Double(getCenter().getX(), getCenter().getY(), getRadius(), getRadius());
    g2.setColor(getColor());
    if (filled = true) {
        g2.draw(cir);
        g2.fill(cir);
    }else {
        g2.draw(cir);
    }
}
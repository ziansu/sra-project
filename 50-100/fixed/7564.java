public void draw(java.awt.Graphics2D g2, boolean filled) {
    java.awt.geom.Rectangle2D.Double rec = new java.awt.geom.Rectangle2D.Double(getCenter().getX(), getCenter().getY(), getRadius(), getRadius());
    g2.setColor(getColor());
    if (filled == true) {
        g2.draw(rec);
        g2.fill(rec);
    }else {
        g2.draw(rec);
    }
}
public void draw(java.awt.Graphics2D g2, boolean filled) {
    java.awt.geom.Rectangle2D.Double rec = new java.awt.geom.Rectangle2D.Double(((getRadius()) * 2), ((getRadius()) * 2), getCenter().getX(), getCenter().getY());
    g2.setColor(java.awt.Color.BLACK);
    if (filled == true) {
        g2.draw(rec);
        g2.fill(rec);
    }else {
        g2.draw(rec);
    }
}
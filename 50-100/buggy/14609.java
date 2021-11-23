public void draw(java.awt.Graphics graphics) {
    graphics.setColor(new java.awt.Color(color.getRed(), color.getGreen(), color.getBlue()));
    java.awt.Graphics2D g2d = ((java.awt.Graphics2D) (graphics.create()));
    java.awt.Shape ellipse = new java.awt.geom.Ellipse2D.Double(center.getX(), center.getY(), majorRadius, minorRadius);
    g2d.draw(ellipse);
    if (isHollow())
        g2d.fill(ellipse);
    
}
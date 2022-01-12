protected void draw(java.awt.Graphics2D g2d, java.awt.Dimension screenSize) {
    centerOfScreen = new java.awt.Dimension(((screenSize.width) / 2), ((screenSize.height) / 2));
    java.awt.geom.AffineTransform defaultAffineTransform = new java.awt.geom.AffineTransform();
    defaultAffineTransform.translate(getScreenX(0), getScreenY(0));
    for (java.util.Map.Entry<com.github.enderbot.Coordinate, com.github.enderbot.Entity> entry : entities.entrySet()) {
        entry.getValue().draw(new java.awt.geom.AffineTransform(defaultAffineTransform), g2d);
    }
}
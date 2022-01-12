public void draw(java.awt.Graphics g) {
    java.awt.Graphics2D g2d = ((java.awt.Graphics2D) (g));
    java.awt.geom.AffineTransform at = java.awt.geom.AffineTransform.getTranslateInstance(x, y);
    at.rotate(java.lang.Math.toRadians(rotation), ((sprite.getWidth(null)) / 2), ((sprite.getHeight(null)) / 2));
    g2d.drawImage(sprite, at, null);
}
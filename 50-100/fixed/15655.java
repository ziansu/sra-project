public void Draw(java.awt.Graphics g) {
    projectileManager.Draw(g);
    double rotation = java.lang.Math.toRadians(angle);
    this.setLocationX(texture.getWidth());
    this.setLocationY(texture.getHeight());
    java.awt.geom.AffineTransform tx = java.awt.geom.AffineTransform.getRotateInstance(rotation, this.getLocationX(), this.getLocationY());
    super.Draw(g, tx);
}
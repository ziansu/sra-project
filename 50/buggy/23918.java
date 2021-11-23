public void setSize(double size) {
    this.size = size;
    e = new java.awt.geom.Ellipse2D.Double(((X) - (size / 2)), ((Y) - (size / 2)), size, size);
}
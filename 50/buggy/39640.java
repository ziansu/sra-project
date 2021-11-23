@java.lang.Override
public java.awt.Rectangle getBoundingBox() {
    java.awt.Dimension dimension = new java.awt.Dimension();
    dimension.setSize(this.drawable.getRenderingSize(), this.drawable.getRenderingSize());
    return new java.awt.Rectangle(this.getPosition(), dimension);
}
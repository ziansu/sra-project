@java.lang.Override
public void draw(final java.awt.Graphics2D g) {
    java.awt.Composite reset = g.getComposite();
    g.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, 0.5F));
    try {
        owner.drawSprite(g, this.x, this.y, this.cloneFacing, this.cloneAnimState, this.cloneFrame);
    } finally {
        g.setComposite(reset);
    }
}
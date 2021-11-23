@java.lang.Override
public void draw(java.awt.Graphics g) {
    super.draw(g);
    java.awt.Graphics2D g2d = ((java.awt.Graphics2D) (g));
    this.applyTransformations(g2d);
    for (edu.virginia.engine.display.DisplayObject child : children) {
        if (child != null) {
            child.draw(g);
        }
    }
    this.reverseTransformations(g2d);
}
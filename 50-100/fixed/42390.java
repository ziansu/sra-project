public void layoutContainer(java.awt.Container parent) {
    java.awt.Rectangle bounds = parent.getBounds();
    java.awt.Insets insets = parent.getInsets();
    bounds.width -= (insets.left) + (insets.right);
    bounds.x = insets.left;
    bounds.height -= (insets.top) + (insets.bottom);
    bounds.y = insets.top;
    int hgap = getRoot().getHgap();
    int vgap = getRoot().getVgap();
    bounds.width -= hgap;
    bounds.height -= vgap;
    root.layout(bounds);
}
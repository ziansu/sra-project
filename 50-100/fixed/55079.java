private java.awt.Rectangle getNormalAdequateSize() throws java.awt.HeadlessException {
    java.awt.Insets i = getToolkit().getScreenInsets(getGraphicsConfiguration());
    java.awt.Rectangle max = new java.awt.Rectangle(getToolkit().getScreenSize());
    max.width -= (i.left) + (i.right);
    max.height -= (i.top) + (i.bottom);
    return max;
}
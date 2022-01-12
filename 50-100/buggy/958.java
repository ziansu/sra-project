@java.lang.Override
public java.awt.Dimension minimumLayoutSize(java.awt.Container parent) {
    java.lang.System.out.println("mini");
    java.awt.Dimension dimension = new java.awt.Dimension(0, 0);
    java.awt.Insets insets = parent.getInsets();
    dimension.width = (insets.left) + (insets.right);
    dimension.height = (insets.top) + (insets.bottom);
    return dimension;
}
@java.lang.Override
public void paint(java.awt.Graphics g) {
    java.awt.Dimension preferredSize = getPreferredSize();
    if ((!(previousDimen.equals(preferredSize))) || ((preferredWidth) != (preferredSize.width))) {
        preferredSize = autoContentsFitSize();
        preferredWidth = preferredSize.width;
        previousDimen.setSize(preferredSize);
    }
    super.paint(g);
}
@java.lang.Override
public void paint(java.awt.Graphics g) {
    java.awt.Dimension preferredSize = getPreferredSize();
    if ((!(previousDimen.equals(preferredSize))) || ((preferredWidth) != (-1))) {
        previousDimen.setSize(autoContentsFitSize());
    }
    super.paint(g);
}
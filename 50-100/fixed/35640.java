protected java.awt.Point getPopupMenuOrigin(java.awt.Component invoker, int x, int y) {
    java.awt.Dimension size = getPreferredScrollableViewportSize();
    java.awt.Point p = new java.awt.Point(x, y);
    javax.swing.SwingUtilities.convertPointToScreen(p, invoker);
    java.awt.Rectangle bounds = com.jidesoft.utils.PortingUtils.ensureOnScreen(new java.awt.Rectangle(p, size));
    p = bounds.getLocation();
    javax.swing.SwingUtilities.convertPointFromScreen(p, invoker);
    return p;
}
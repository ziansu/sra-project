public int scroll(javax.swing.JComponent c, java.lang.String dir) {
    java.awt.Rectangle visible = c.getVisibleRect();
    java.awt.Rectangle bounds = c.getBounds();
    if ("up".equals(dir)) {
        visible.y = 0;
    }else {
        visible.y = (bounds.height) - (visible.height);
    }
    c.scrollRectToVisible(visible);
    return visible.y;
}
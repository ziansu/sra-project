public java.awt.Rectangle getVisibleRowBounds(java.awt.Rectangle rowBounds) {
    java.awt.Rectangle visibleTreeBounds = ((javax.swing.JComponent) (getTree())).getVisibleRect();
    java.awt.Rectangle visibleRowBounds = visibleTreeBounds.intersection(rowBounds);
    return visibleRowBounds;
}
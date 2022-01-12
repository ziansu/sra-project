public java.awt.Rectangle getVisibleRowBounds(java.awt.Rectangle rowBounds) {
    java.awt.Rectangle visibleTreeBounds = getTree().getVisibleRect();
    java.awt.Rectangle visibleRowBounds = visibleTreeBounds.intersection(rowBounds);
    return visibleRowBounds;
}
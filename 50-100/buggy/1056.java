@java.lang.Override
protected void paintThumb(java.awt.Graphics g, javax.swing.JComponent c, java.awt.Rectangle thumbBounds) {
    super.paintThumb(g, c, thumbBounds);
    if (((((javax.swing.JScrollBar) (c)).getValue()) - 1) == (displayedSliceIndex_)) {
        g.setColor(imagedisplay.ColorableScrollbarUI.DARK_GREEN);
        g.drawRect(thumbBounds.x, thumbBounds.y, thumbBounds.width, thumbBounds.height);
    }
}
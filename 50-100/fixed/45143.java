private java.awt.Dimension setFrameSize() {
    frame.show();
    java.awt.Insets insets = frame.getInsets();
    int windowW = ((java.lang.Math.max(sketchWidth, processing.core.MIN_WINDOW_WIDTH)) + (insets.left)) + (insets.right);
    int windowH = ((java.lang.Math.max(sketchHeight, processing.core.MIN_WINDOW_HEIGHT)) + (insets.top)) + (insets.bottom);
    frame.setSize(windowW, windowH);
    return new java.awt.Dimension(windowW, windowH);
}
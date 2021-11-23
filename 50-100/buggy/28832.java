@java.lang.Override
public void componentResized(java.awt.event.ComponentEvent e) {
    java.awt.Dimension panelSize = canvasPanel_.getSize();
    canvas_.updateSize(panelSize);
    java.awt.Dimension canvasSize = canvas_.getSize();
    if (((canvasSize.width) < (panelSize.width)) || ((canvasSize.height) < (panelSize.height))) {
        canvasPanel_.setSize(canvasSize);
        pack();
    }
    doLayout();
}
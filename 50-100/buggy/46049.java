@java.lang.Override
public void componentResized(java.awt.event.ComponentEvent e) {
    java.awt.Dimension newSize = e.getComponent().getBounds().getSize();
    double newFactor = (newSize.getHeight()) / 600;
    if (((newSize.getWidth()) / 800) > newFactor)
        newFactor = newSize.getWidth();
    
    drawGraph(newFactor);
}
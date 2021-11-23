@java.lang.Override
public void mouseDragged(java.awt.event.MouseEvent e) {
    if ((dragged) != null) {
        dragging = true;
        javax.swing.Box box = dragged.getData();
        box.setLocation(e.getPoint());
    }else
        boundary = makeBox(p0, e.getPoint());
    
    repaint();
}
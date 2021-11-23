@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent e) {
    r.setDrawBoundingBox(false);
    if ((r.getConfig().getShape()) == (cs132.instructions.Shape.PENCIL)) {
        prevMouseLocation = mouseLocation;
        r.setDrawShape(false);
    }else {
        r.setDrawShape(true);
    }
    dragStart = true;
    r.repaint();
}
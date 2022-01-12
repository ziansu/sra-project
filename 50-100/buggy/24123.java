@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent me) {
    if (isSelected) {
        isSelected = false;
    }else {
        shapes.get(((shapes.size()) - 1)).x2 = me.getX();
        shapes.get(((shapes.size()) - 1)).y2 = me.getY();
        repaint();
        createNewitem();
    }
}
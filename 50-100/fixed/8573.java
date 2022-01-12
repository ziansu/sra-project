@java.lang.Override
public void mouseMoved(java.awt.event.MouseEvent me) {
    if (isSelected(me.getX(), me.getY())) {
        setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
    }else {
        setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.CROSSHAIR_CURSOR));
    }
}
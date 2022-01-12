@java.lang.Override
public void mouseMoved(java.awt.event.MouseEvent e) {
    java.awt.Point p = e.getPoint();
    boolean cursorHand = map().getAttribution().handleAttributionCursor(p);
    if (cursorHand) {
        map().setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }else {
        map().setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }
}
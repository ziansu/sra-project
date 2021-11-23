@java.lang.Override
public void mouseEntered(java.awt.event.MouseEvent e) {
    Map.MapRangeIndicator t = ((Map.MapRangeIndicator) (e.getSource()));
    switch (t.passability) {
        case UNOCCUPIED :
            setCursor(moveCursor);
            break;
        case ARMY :
            setCursor(battleCursor);
            break;
        case COLLECTABLE :
            setCursor(actionCursor);
            break;
    }
}
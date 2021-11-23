@java.lang.Override
public void mouseEntered(java.awt.event.MouseEvent e) {
    if ((currentAction) != (View.MainV.NO_ACTION)) {
        paneMs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }else {
        paneMs.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }
}
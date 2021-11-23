@java.lang.Override
public boolean value(java.lang.Object o) {
    if (o instanceof java.awt.event.MouseEvent) {
        java.awt.event.MouseEvent me = ((java.awt.event.MouseEvent) (o));
        if ((getActionUnder(me.getPoint())) != null) {
            if ((me.getID()) == (java.awt.event.MouseEvent.MOUSE_CLICKED)) {
                javax.swing.SwingUtilities.invokeLater(() -> {
                    myMouseAdapter.mouseClicked(me);
                });
            }
            return true;
        }
    }
    return false;
}
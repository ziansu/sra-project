protected void mouseReleased(final java.awt.event.MouseEvent aEvent) {
    final javax.swing.JComponent view = getDeepestComponentAt(aEvent);
    if ((view == null) || (!(javax.swing.SwingUtilities.isDescendingFrom(view, getComponentRoot())))) {
        return ;
    }
    final java.awt.Point point = javax.swing.SwingUtilities.convertPoint(aEvent.getComponent(), aEvent.getPoint(), view);
    view.setCursor(null);
    if (!(handlePopupTrigger(view, point, aEvent))) {
        this.movingCursor = -1;
    }
}
public void mouseAction(java.awt.event.MouseEvent e) {
    if (e.isPopupTrigger()) {
        org.parosproxy.paros.view.View.getSingleton().getPopupMenu().show(e.getComponent(), e.getX(), e.getY());
    }
}
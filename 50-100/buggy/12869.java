public void mouseAction(java.awt.event.MouseEvent e) {
    if ((((e.getModifiers()) & (java.awt.event.InputEvent.BUTTON3_MASK)) != 0) || (e.isPopupTrigger())) {
        org.parosproxy.paros.view.View.getSingleton().getPopupMenu().show(e.getComponent(), e.getX(), e.getY());
    }
}
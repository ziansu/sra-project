@java.lang.Override
protected void configurePopup() {
    super.configurePopup();
    addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
        @java.lang.Override
        public void popupMenuWillBecomeVisible(final javax.swing.event.PopupMenuEvent e) {
            arrow.setIcon(collapseIcon);
            comboBox.repaint();
        }

        @java.lang.Override
        public void popupMenuWillBecomeInvisible(final javax.swing.event.PopupMenuEvent e) {
            arrow.setIcon(expandIcon);
        }

        @java.lang.Override
        public void popupMenuCanceled(final javax.swing.event.PopupMenuEvent e) {
            arrow.setIcon(expandIcon);
        }
    });
}
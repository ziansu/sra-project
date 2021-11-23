private void tbFieldsKeyReleased(java.awt.event.KeyEvent evt) {
    if (evt.isAltDown()) {
        javax.swing.JTable tb = ((javax.swing.JTable) (evt.getSource()));
        cancelTablesEditions(tb);
        if (((evt.getKeyCode()) == (java.awt.event.KeyEvent.VK_UP)) || ((evt.getKeyCode()) == (java.awt.event.KeyEvent.VK_DOWN))) {
            reoderRow(tb, ((evt.getKeyCode()) == (java.awt.event.KeyEvent.VK_UP)));
        }
    }
}
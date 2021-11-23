public void mouseEntered(java.awt.event.MouseEvent evt) {
    if ((evt.getSource()) instanceof javax.swing.AbstractButton) {
        javax.swing.AbstractButton button = ((javax.swing.AbstractButton) (evt.getSource()));
        javax.swing.Action action = button.getAction();
        if (action != null) {
            java.lang.Object message = action.getValue(javax.swing.Action.LONG_DESCRIPTION);
            statusBar.setMessage(message.toString());
        }
    }
}
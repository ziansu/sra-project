private void Message_EditorPaneKeyPressed(java.awt.event.KeyEvent evt) {
    if ((evt.getKeyCode()) == (java.awt.event.KeyEvent.VK_ENTER)) {
        evt.consume();
        Message_EditorPane.setText("");
        clientnet.Send(Message_EditorPane.getText(), chatRoomid);
        resetToggleButton();
    }
}
private void sendMessage() {
    java.lang.String text = jTextFieldMessage.getText();
    java.lang.String msg = text.trim();
    jTextFieldMessage.setText("");
    java.util.List<java.lang.String> users = new java.util.ArrayList<>();
    if (jToggleButtonSelectUsers.isSelected()) {
        users = jListUsers.getSelectedValuesList();
    }
    con.sendMessage(msg, users);
}
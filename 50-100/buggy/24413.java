private void sendMessage() {
    java.lang.String msg = jTextFieldMessage.getText();
    jTextFieldMessage.setText("");
    java.util.List<java.lang.String> users = new java.util.ArrayList<>();
    if (jToggleButtonSelectUsers.isSelected()) {
        users = jListUsers.getSelectedValuesList();
    }
    con.sendMessage(msg, users);
}
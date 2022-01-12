private void sendMessage() {
    if (!(MessageSend.getText().equals(""))) {
        MessageSend.setText("");
        java.lang.String message = MessageSend.getText().trim();
        homebase.sendMessage(buddyName, message);
        addMessage(message, homebase.getClient().getCurrentUsername(), false);
    }
}
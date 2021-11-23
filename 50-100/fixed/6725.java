private void sendMessage() {
    if (!(MessageSend.getText().equals(""))) {
        java.lang.String message = MessageSend.getText().trim();
        MessageSend.setText("");
        homebase.sendMessage(buddyName, message);
        addMessage(message, homebase.getClient().getCurrentUsername(), false);
    }
}
private void setAndSendPrivateMessage() {
    privateMsg = field_message.getText();
    client.sendPrivateMessage(privateMsg, "Pierre");
}
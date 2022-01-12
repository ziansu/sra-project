public void sendMessage(java.lang.String newMessage) {
    message = newMessage;
    messageSender.run();
}
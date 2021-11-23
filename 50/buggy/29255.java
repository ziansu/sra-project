public void queueMessage(connection.Message message) {
    this.messages.add(message);
    java.lang.System.out.println(("BOOMBBOM: " + (message.getMessage())));
}
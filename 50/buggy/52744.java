private void queueMessage(connection.Message message) {
    synchronized(this.messages) {
        this.messages.add(message);
    }
}
public void queueMessage(connection.Message message) {
    if (this.sendMessages)
        this.messages.add(message);
    
}
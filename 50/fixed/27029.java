public boolean continuesReceivingMessages() {
    this.receiveMessage();
    return (this.lastMessageReceived) != null;
}
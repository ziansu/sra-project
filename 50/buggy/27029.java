public boolean continuesReceivingMessages() {
    try {
        this.lastMessageReceived = this.receiveMessage();
    } catch (java.io.IOException io) {
        return false;
    }
    return (this.lastMessageReceived) != null;
}
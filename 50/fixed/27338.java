public void disconnectFromServer() {
    com.netboard.message.ApplyMoveMessage disconnectMsg = new com.netboard.message.ApplyMoveMessage(null, 0, 0, false);
    writeMessage(disconnectMsg);
}
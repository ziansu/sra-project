@java.lang.Override
public void cmdPlayerLeft(int leftPlayerID, java.lang.String reason) {
    sendToClient(java.lang.String.join(server.COMMAND_DELIMITER, server.SERVER_LEFT, java.lang.String.valueOf(leftPlayerID), reason), false);
}
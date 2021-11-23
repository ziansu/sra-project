@java.lang.Override
public void cmdGameEnd(int winnerID) {
    sendToClient(java.lang.String.join(server.COMMAND_DELIMITER, server.SERVER_GAME_END, java.lang.String.valueOf(winnerID)));
}
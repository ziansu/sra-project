@java.lang.Override
public void cmdMoveSuccess(int moveX, int moveY, int actorID, int playerWhoHasNextTurnID) {
    sendToClient(java.lang.String.join(server.COMMAND_DELIMITER, server.SERVER_MOVE_SUCCESS, java.lang.String.valueOf(moveX), java.lang.String.valueOf(moveY), java.lang.String.valueOf(actorID), java.lang.String.valueOf(playerWhoHasNextTurnID)));
}
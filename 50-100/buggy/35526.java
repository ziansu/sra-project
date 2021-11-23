@java.lang.Override
public void cmdGame(java.lang.String nameOtherPlayer, int otherPlayerID, int playFieldX, int playFieldY, int playFieldZ, int playerWhoHasNextTurnID, int sequenceLengthOfWin) {
    sendToClient(java.lang.String.join(server.COMMAND_DELIMITER, server.SERVER_GAME, nameOtherPlayer, java.lang.String.valueOf(otherPlayerID), java.lang.String.valueOf(playFieldX), java.lang.String.valueOf(playFieldY), java.lang.String.valueOf(playFieldZ), java.lang.String.valueOf(playerWhoHasNextTurnID), java.lang.String.valueOf(sequenceLengthOfWin)));
}
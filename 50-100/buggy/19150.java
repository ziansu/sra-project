@java.lang.Override
public boolean executeGamePlay(com.paul.Players.Player currPlayer) {
    playBoard.clearBoard();
    for (int turns = 0; (isGameInProgress) && (turns < (playBoard.getSize())); turns++) {
        com.paul.board.BoardDrawer.drawBoard(playBoard);
        out.writeOut((("printCharacterPlacingMessage" + " ") + (currPlayer.getCharacter())));
        int where = getAvailableFieldNumFromUser(currPlayer);
        checkStateOfGame(where, currPlayer);
        currPlayer = currPlayer.switchPlayer(players);
    }
    return false;
}
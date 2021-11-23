private int[] getPlayersTurns() {
    int[] playersTurns = new int[players.length];
    for (int playerNum = 0; playerNum < (players.length); playerNum++) {
        playersTurns[playerNum] = getPlayerForBoard(players[playerNum].getFigure().toString());
    }
    return playersTurns;
}
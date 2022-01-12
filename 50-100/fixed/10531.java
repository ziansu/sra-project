private int getMove(com.rijul.game.core.Board board) {
    java.lang.String boardAsString = getBoardAsString(board);
    if (boardAsString.equals(com.rijul.game.app.player.impl.Bot.INITIAL_BOARD)) {
        int ind = random.nextInt(com.rijul.game.app.player.impl.Bot.INITIAL_MOVES.length);
        return com.rijul.game.app.player.impl.Bot.INITIAL_MOVES[ind];
    }
    getOptimalResultForBoardPosition(board, 1);
    return optimalMoveFromBoardPosition.get(boardAsString);
}
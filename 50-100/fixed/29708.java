public void makeMove() {
    int score = minimaxScore(this.board.getBoardPositions(), playerNum);
    int move = this.nextMove;
    java.lang.System.out.println(("DEBUG: nextMove: " + (this.nextMove)));
    board.makeMove(playerNum, move);
}
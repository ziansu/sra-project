private boolean checkIfOnBoard(int[] move) {
    boolean a = ((move[0]) < (board.getBoardSize())) && ((move[1]) < (board.getBoardSize()));
    return a;
}
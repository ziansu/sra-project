private static java.lang.String getBoardAntiDiagonal(final java.lang.Character[][] board) {
    java.lang.StringBuffer sb = new java.lang.StringBuffer();
    for (int i = 0; i < (board.length); i++) {
        sb.append(board[i][(((board.length) - i) - 1)]);
    }
    return sb.toString();
}
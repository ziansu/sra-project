private static java.lang.String getBoardAntiDiagonal(final java.lang.Character[][] board) {
    java.lang.StringBuffer sb = new java.lang.StringBuffer();
    for (int i = (board.length) - 1; i >= 0; i--) {
        sb.append(board[i][i]);
    }
    return sb.toString();
}
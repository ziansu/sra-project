public void printMatrix(char[][] board) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (int i = 0; i < (board.length); i++) {
        int c = board[i].length;
        for (int j = 0; j < c; j++) {
            sb.append(board[i][j]);
        }
        sb.append("\n");
    }
    java.lang.System.out.print(sb.toString());
}
public void printMatrix(char[][] board) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (int i = 0; i < (board.length); i++) {
        sb.append("\n");
        for (int j = 0; j < (board[i].length); j++) {
            sb.append(board[i][j]);
        }
    }
    java.lang.System.out.println(sb.toString());
}
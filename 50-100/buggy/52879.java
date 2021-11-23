public List<java.lang.String[]> solveNQueens(int n) {
    List<java.lang.String[]> solutions = new ArrayList<java.lang.String[]>();
    char[][] board = new char[n][n];
    for (int row = 0; row < n; row++) {
        for (int col = 0; col < n; col++)
            board[row][col] = '.';
        
    }
    solveNQueens(solutions, board, 0);
    return solutions;
}
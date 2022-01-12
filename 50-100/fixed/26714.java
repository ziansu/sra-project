public static boolean isEmpty(int[][] board, int i, int j) {
    if ((((i > (-1)) && (i < 8)) && (j > (-1))) && (j < 8))
        if ((board[i][j]) == (Checkers.empty))
            return true;
        
    
    return false;
}
public static boolean checkEnd() {
    for (int i = 0; i < (com.company.EightQueens.size); i++) {
        if ((com.company.EightQueens.board[i][com.company.EightQueens.size]) > 0)
            return true;
        
    }
    return false;
}
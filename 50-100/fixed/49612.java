public static boolean checkWinX(char dot) {
    for (int i = -1; i <= 1; i++) {
        for (int j = -1; j <= 1; j++) {
            if ((j == 0) && (i == 0))
                continue;
            
            if (TicTacToe.checkLine(TicTacToe.lastY, TicTacToe.lastX, i, j, TicTacToe.ROW_FOR_WIN, dot))
                return true;
            
        }
    }
    return false;
}
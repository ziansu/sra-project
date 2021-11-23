public static boolean checkAcross(java.lang.String[][] board, java.lang.String symbol, int n) {
    int counter = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (board[i][j].equals(symbol))
                counter++;
            
        }
        counter = 0;
    }
    if (counter == n)
        return true;
    else
        return false;
    
}
public static boolean checkDown(java.lang.String[][] board, java.lang.String symbol, int n) {
    int counter = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (board[j][i].equals(symbol))
                counter++;
            
        }
        if (counter == n)
            return true;
        
        counter = 0;
    }
    return false;
}
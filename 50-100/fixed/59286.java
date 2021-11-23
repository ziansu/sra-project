java.lang.Boolean checkAntiDiagonalsLeadsToWin(int x, int y, char state) {
    if ((x + y) == ((n) - 1)) {
        for (int i = 0; i < (n); i++) {
            if ((board[i][(((n) - 1) - i)]) != state)
                break;
            
            if (i == ((n) - 1)) {
                return true;
            }
        }
    }
    return false;
}
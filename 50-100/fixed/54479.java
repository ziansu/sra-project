@java.lang.Override
public boolean isGameOver() {
    if (isGameWon()) {
        return true;
    }
    for (int i = 0; i < (board.length()); i++) {
        if ((board.charAt(i)) == '0')
            return false;
        
    }
    return true;
}
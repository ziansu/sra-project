public boolean isGameOver() {
    int score = board.evaluateBoard();
    if (score == 1) {
        didSomeoneWin = true;
        return true;
    }else
        return false;
    
}
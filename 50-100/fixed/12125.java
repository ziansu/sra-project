public static int eval(Board board) {
    int sum = 50;
    int score = board.isConnectN();
    if (score == 1) {
        sum = 1000;
    }else
        if (score == 2) {
            sum = -1000;
        }else
            if (score == (-1)) {
            }
        
    
    return sum;
}
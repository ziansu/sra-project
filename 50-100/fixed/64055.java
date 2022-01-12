public void run() {
    java.lang.System.err.println((("WHITE: " + ((antiChess.AntiChess.timerLimit) - (antiChess.AntiChess.whiteSeconds))) + "s left"));
    if ((antiChess.AntiChess.whiteSeconds) >= (antiChess.AntiChess.timerLimit))
        antiChess.AntiChess.getWinner(java.awt.Color.BLACK);
    
    (antiChess.AntiChess.whiteSeconds)++;
}
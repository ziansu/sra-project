private static void compareHigh(java.util.List<java.lang.Integer> x, java.util.List<java.lang.Integer> y) {
    int player1High = week1Problems.P6.findHighCard(x);
    int player2High = week1Problems.P6.findHighCard(y);
    int player1WinCount = 0;
    int player2WinCount = 0;
    if (player1High > player2High) {
        player1WinCount++;
        java.lang.System.out.print("Player 1 wins");
    }else
        if (player1High == player2High) {
            week1Problems.P6.compareNextHigh(x, y, player1WinCount, player2WinCount);
        }else {
            player2WinCount++;
            java.lang.System.out.print("Player 2 wins");
        }
    
}
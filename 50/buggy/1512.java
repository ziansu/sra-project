public boolean getPlayerA(int player) {
    boolean toReturn = false;
    if (player == 1) {
        toReturn = player1A;
        player1Start = false;
    }else
        if (player == 2) {
            toReturn = player2A;
            player2Start = false;
        }
    
    return toReturn;
}
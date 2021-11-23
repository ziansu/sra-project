private int checkForWinner() {
    int[] loser = new int[]{ 0 , 0 };
    if (java.util.Arrays.equals(playerFingers[0], loser)) {
        return 0;
    }else
        if (java.util.Arrays.equals(playerFingers[1], loser)) {
            return 1;
        }
    
    return -1;
}
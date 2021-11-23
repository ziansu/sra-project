private int getFirstPlayerNum(final com.java.laiy.model.Player firstPlayer) {
    int firstPlayerPositionNum = 0;
    for (int num = 0; num < (players.length); num++) {
        if ((players[num]) == firstPlayer) {
            firstPlayerPositionNum = num;
        }
    }
    return firstPlayerPositionNum;
}
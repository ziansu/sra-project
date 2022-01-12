private boolean checkHorizontalPattern(com.connect.connectfour.game.ConnectFour.Player player, int row) {
    int count = 0;
    for (int i = 0; i < ((com.connect.connectfour.game.ConnectFour.COLUMN_COUNT) - 1); ++i) {
        if (mGameState[row][i].isEmpty())
            continue;
        
        if ((mGameState[row][i].getPlayer()) != player) {
            count = 0;
            continue;
        }
        count++;
        if (count == 4)
            return true;
        
    }
    return false;
}
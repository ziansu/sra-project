private boolean checkVerticalPattern(com.connect.connectfour.game.ConnectFour.Player player, int column) {
    int count = 0;
    for (int i = 0; i < (com.connect.connectfour.game.ConnectFour.ROW_COUNT); ++i) {
        if ((mGameState[i][column].isEmpty()) || ((mGameState[i][column].getPlayer()) != player)) {
            count = 0;
            continue;
        }
        count++;
        if (count == 4)
            return true;
        
    }
    return false;
}
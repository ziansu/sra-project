public int getCurrentPlayerDistance(int player, int hole) {
    int current = dicegame.Game.distancesRemaining[player][hole];
    return current;
}
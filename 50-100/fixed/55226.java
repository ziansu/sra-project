public int calculateWinRatioOnAllGames(int wins, int defeats, int draws) {
    int allGames = (wins + defeats) + draws;
    if (allGames > 0) {
        double winRatio = wins / allGames;
        winRatio = winRatio * 100;
        return ((int) (winRatio));
    }else {
        return 0;
    }
}
private boolean updateGames(java.lang.String user, boolean won) {
    java.util.Map<java.lang.String, java.lang.Object> userInfo = data.get(user);
    int gamesPlayed = ((java.lang.Integer) (userInfo.get(groupn.spin_counter.model.LocalScoreManager.GamesPlayedKey)));
    int gamesWon = ((java.lang.Integer) (userInfo.get(groupn.spin_counter.model.LocalScoreManager.GamesWonKey)));
    gamesPlayed += 1;
    gamesWon += (won) ? 1 : 0;
    return true;
}
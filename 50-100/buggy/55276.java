private void createNewGameRound(int startturnpos) {
    int whoseturn = startturnpos % (getPlayers().size());
    if (whoseturn == 0)
        whoseturn = getPlayers().size();
    
    com.adansoft.great21.models.GameRound round = new com.adansoft.great21.models.GameRound(lobbyName, gameType, gameInstanceId, gamePointsBased, gameMoneyBased, moneyPerCard, noofdecks, whoseturn, includeJokerinDeck, numofJokers);
    round.setPlayerlist(getActivePlayersinGame());
    round.initshowStatusMap();
    round.startRound();
    currentGameRound = round;
}
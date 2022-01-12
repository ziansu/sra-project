public void startGame() {
    startGame = 1;
    playerList = getPlayersOfSession(session);
    session.setPlayerList(playerList);
}
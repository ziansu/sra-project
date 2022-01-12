public void startGame() throws engine.NumberOfPlayersException {
    currentGameData = gdfx.get(0);
    players = new java.util.ArrayList<>();
    for (engine.Player p : currentGameData.getPlayers()) {
        players.add(new engine.Player(p.getName().get(0)));
    }
    currentPlayer = players.get(0);
    isGameStarted = true;
    startTime = java.lang.System.currentTimeMillis();
    tryNumber = 0;
}
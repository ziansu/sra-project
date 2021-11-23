private void newGame(java.lang.String[] patterns, java.lang.String[] colours, java.lang.String[] names, application.Player[] players) {
    for (int i = 0; i < (players.length); i++) {
        setSnake(patterns[pattern[i]], colours[colour[i]], names[i], players[i]);
    }
    stage.close();
    audio.changeSong("gameLoop.mp3");
    new application.Multiplayer(players);
}
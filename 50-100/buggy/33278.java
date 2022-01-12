public void run() {
    if (game.isGameOver) {
        java.lang.System.out.println("Game has ended");
        if (game.win) {
            orbit.desktop.Orbit.sendRequest(new orbit.ServerRequest("Update user", game.players.get(game.playerIndex)));
        }
        lobby.enableButtons(true);
        this.cancel();
    }
}
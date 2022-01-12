public void run() {
    if (game.isGameOver) {
        lobby.enableButtons(true);
        java.lang.System.out.println("Game has ended");
        if (game.win) {
            orbit.desktop.Orbit.sendRequest(new orbit.ServerRequest("Update user", game.players.get(game.playerIndex)));
        }
        this.cancel();
    }
}
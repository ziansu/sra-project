public void reload() {
    Super_Trump.STPlayer humanPlayer = game.getHumPlayer();
    if ((playerView) != null) {
        remove(playerView);
    }
    playerView = new Super_Trump.PlayerView(humanPlayer);
    add(playerView, java.awt.BorderLayout.CENTER);
}
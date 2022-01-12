public void reload() {
    if ((playerView) != null) {
        remove(playerView);
    }
    Super_Trump.STPlayer humanPlayer = game.getHumPlayer();
    playerView = new Super_Trump.PlayerView(humanPlayer);
    add(playerView, java.awt.BorderLayout.CENTER);
}
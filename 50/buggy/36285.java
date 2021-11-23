public void setPlayer(game.sprites.Player player) {
    if (player == null)
        return ;
    
    statsPanel.setPlayerImage(player.getImage());
    controlPanel.setPlayer(player);
    itemPanel.setPlayer(player);
}
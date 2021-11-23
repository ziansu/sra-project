public void setPlayer(game.sprites.Player player) {
    if (player == null)
        return ;
    
    statsPanel.setPlayer(player);
    controlPanel.setPlayer(player);
    itemPanel.setPlayer(player);
}
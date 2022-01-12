private void updatePlayerList() {
    areaPlayerListing.setText("Computer Players:\n");
    for (int i = 1; i <= ((comboBoxPlayers.getSelectedIndex()) + 1); i++)
        areaPlayerListing.append((((("Player " + i) + ". Cards left: ") + (game.getPlayer(i).getDeck().getSize())) + "\n"));
    
}
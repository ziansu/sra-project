public void nextPlayerTurn() {
    if ((this.currentPlayer.getPlayerNumber()) < (this.numPlayers)) {
        for (parts.Player p : allPlayers) {
            if ((p.getPlayerNumber()) == ((this.currentPlayer.getPlayerNumber()) + 1)) {
                currentPlayer = p;
                break;
            }
        }
    }else
        if ((currentPlayer.getPlayerNumber()) == (this.numPlayers)) {
            currentPlayer = allPlayers.get(0);
        }
    
}
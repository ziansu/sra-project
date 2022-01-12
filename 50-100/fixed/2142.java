public boolean checkAllPlayers() {
    for (int i = 0; i < (players.size()); i++) {
        if ((players.get(i)) != null) {
            if (!(checkForMoves(players.get(i).getPlayer(), board).equals("No options left"))) {
                turn = ((turn) + 1) % (numberOfPlayers);
                nextPlayer = true;
                return true;
            }
        }
    }
    return false;
}
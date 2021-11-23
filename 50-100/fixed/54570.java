public boolean allOthersHavePassed(int currentPlayer) {
    for (int i = (currentPlayer + 1) % (numberOfPlayers); i != currentPlayer; i = (i + 1) % (numberOfPlayers)) {
        if (!(players.get(i).getPassFlag()))
            return false;
        
    }
    return !(players.get(currentPlayer).getPassFlag());
}
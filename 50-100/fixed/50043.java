public gameOfCluedo.Player getWinner() {
    if ((players.size()) == (eliminated.size())) {
        winner = null;
    }else
        if (((players.size()) - (eliminated.size())) <= 1) {
            players.removeAll(eliminated);
            winner = players.get(0);
        }
    
    return winner;
}
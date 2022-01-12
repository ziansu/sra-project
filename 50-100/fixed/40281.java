public cluedo.Player nextPlayer() {
    int i = players.indexOf(currentPlayer);
    do {
        i++;
        if (i >= (players.size())) {
            i = 0;
        }
    } while (players.get(i).hasLost() );
    cluedo.Player play = players.get(i);
    if (play.equals(currentPlayer)) {
        return null;
    }
    currentPlayer = play;
    return play;
}
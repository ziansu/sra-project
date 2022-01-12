public cluedo.Player nextPlayer() {
    int i = players.indexOf(currentPlayer);
    java.lang.System.out.println(i);
    do {
        i++;
        if (i >= (players.size())) {
            i = 0;
        }
    } while (players.get(i).hasLost() );
    java.lang.System.out.println(i);
    cluedo.Player play = players.get(i);
    if (play.equals(currentPlayer)) {
        return null;
    }
    currentPlayer = play;
    return play;
}
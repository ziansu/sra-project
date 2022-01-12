private int decideWinner() {
    int max = 0;
    int winner = 0;
    for (int i = 0; i < (playersIn.size()); i++) {
        if ((playersIn.get(i).hand.getGameValue()) > max) {
            max = playersIn.get(i).hand.getGameValue();
            winner = i;
        }
    }
    return winner;
}
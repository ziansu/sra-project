public int nextPlayer(int lastPlayer) {
    int count = 1;
    do {
        if (playersInGame[((lastPlayer + count) % (numberOfPlayers))]) {
            return (lastPlayer + count) % (numberOfPlayers);
        }
        count++;
    } while (count < (numberOfPlayers) );
    return -1;
}
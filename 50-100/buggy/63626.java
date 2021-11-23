public int getNextPlayer() {
    if (clockwise) {
        if (((currentPlayerIndex) + 1) > (players.size())) {
            return 0;
        }
        return (currentPlayerIndex) + 1;
    }else {
        if (((currentPlayerIndex) - 1) < 0) {
            return players.size();
        }
        return (currentPlayerIndex) - 1;
    }
}
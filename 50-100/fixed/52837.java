public void playersDraw() {
    for (int i = 0; i < ((players.length) - 1); i++) {
        for (int j = i + 1; j < (players.length); j++) {
            if (i != j) {
                playerDraw(players[i], players[j]);
            }
        }
    }
}
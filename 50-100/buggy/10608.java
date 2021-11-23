public void startTournament() throws java.lang.Exception {
    for (int p1 = 0; p1 < (players.size()); p1++) {
        for (int p2 = p1; p2 < (players.size()); p2++) {
            if (p1 != p2) {
                startGame(players.get(p1), players.get(p2));
            }
        }
    }
}
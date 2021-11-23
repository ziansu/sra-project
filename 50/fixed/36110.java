private static void rotateOpeningPlayer() {
    poker.PokerPlayer rotate = poker.GameOfPoker.players.remove(0);
    poker.GameOfPoker.players.add(rotate);
}
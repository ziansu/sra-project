private static void removePlayerCheck(int i) {
    if (poker.GameOfPoker.players.get(i).isBust()) {
        java.lang.System.out.println((("Player " + (poker.GameOfPoker.players.get(i).name)) + " has no chips remaining and has been eliminated from the game."));
        poker.GameOfPoker.players.remove(i);
        (poker.GameOfPoker.botNum)--;
    }
}
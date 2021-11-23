public static void startGame(int playercount, int boardsize) {
    game.GameMaster.reset();
    for (int i = 1; i <= playercount; i++) {
        game.GameMaster.playerAL.add(new game.Player(0.0, i, 0.0, 0, game.GameMaster.names[(i - 1)], 0));
    }
    game.GameMaster.EndCheck = boardsize;
    game.GameMaster.PlayerInTurn = game.GameMaster.playerAL.get(0);
}
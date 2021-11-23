private static com.ttoggweiler.cse5693.TicTacToe.player.BasePlayer randomVsSequential(int boardSize, int iterations, java.util.Set<com.ttoggweiler.cse5693.TicTacToe.board.Move[]> initMoves) {
    com.ttoggweiler.cse5693.TicTacToe.player.BasePlayer p1 = new com.ttoggweiler.cse5693.TicTacToe.player.RandomPlayer();
    com.ttoggweiler.cse5693.TicTacToe.player.BasePlayer p2 = new com.ttoggweiler.cse5693.TicTacToe.player.SequentialPlayer();
    return com.ttoggweiler.cse5693.TTTGameRunner.playGames(p1, p2, boardSize, iterations, initMoves);
}
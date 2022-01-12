public static void main(java.lang.String[] args) {
    java.util.List<com.danieleocchipinti.connect4game.Player> players = new java.util.ArrayList<>();
    com.danieleocchipinti.connect4game.Player player1 = org.mockito.Mockito.spy(new com.danieleocchipinti.connect4game.Player());
    com.danieleocchipinti.connect4game.Player player2 = new com.danieleocchipinti.connect4game.Player();
    players.add(player1);
    players.add(player2);
    com.danieleocchipinti.connect4game.Board board = new com.danieleocchipinti.connect4game.Board();
    com.danieleocchipinti.connect4game.Game game = new com.danieleocchipinti.connect4game.Game(board, players, new com.danieleocchipinti.connect4game.WinnerDetector(board));
    game.start();
}
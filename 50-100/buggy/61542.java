public static void main(java.lang.String[] args) {
    boardGame.BoardGame<boardGame.ttt.TicTacToeState> game = new boardGame.ttt.TicTacToe();
    boardGame.BoardGamePlayer[] players = new boardGame.BoardGamePlayer[]{ new boardGame.ttt.TicTacToePlayerHuman() , new boardGame.BoardGamePlayerRandom<boardGame.ttt.TicTacToeState>() };
    while (!(game.isGameOver())) {
        java.lang.System.out.println(game);
        game.move(players[game.getCurrentPlayer()]);
    } 
    java.lang.System.out.println("Game over");
    java.lang.System.out.println(game);
}
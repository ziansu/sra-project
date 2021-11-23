public static void main(java.lang.String[] args) {
    game.Go go = new game.Go();
    player.Player p1 = new player.HumanPlayer(go.askName(), Stone.BLACK);
    player.Player p2 = new player.HumanPlayer(go.askName(), Stone.WHITE);
    game.Game game = new game.Game(p1, p2, go.askBoardSize());
    game.start();
}
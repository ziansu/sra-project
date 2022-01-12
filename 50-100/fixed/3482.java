private void startGame() {
    main.Board board = new main.Board();
    main.Player p1 = new main.Player(2, 2, 1, 1, board, 1);
    main.Player p2 = new main.Player(7, 7, 8, 8, board, 2);
    new mvc.View(new mvc.Model(p1, p2));
    dispose();
}
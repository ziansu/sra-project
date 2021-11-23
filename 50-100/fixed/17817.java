public static void main(java.lang.String[] args) {
    int winner;
    uno.Strategy color = new uno.testStrategy();
    uno.Strategy color1 = new uno.testStrategy();
    uno.Game game = new uno.Game();
    for (int i = 0; i < 5; i++) {
        game = new uno.Game();
        winner = game.playGame(color, color1);
        java.lang.System.out.println((("Strategy " + winner) + " wins!"));
    }
}
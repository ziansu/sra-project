private com.rijul.game.app.player.spec.Player getHumanPlayer(int playerNumber) {
    java.lang.System.out.println((("Enter name for Player " + playerNumber) + ": "));
    java.lang.System.out.print(">>  ");
    java.lang.String name = scanner.nextLine();
    com.rijul.game.app.player.spec.Player player = new com.rijul.game.app.player.impl.HumanPlayer(name, playerNumber);
    return player;
}
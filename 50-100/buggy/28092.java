public static void main(java.lang.String[] args) {
    Player player1 = new Player("player1", Player.playerType.HUMAN, 1);
    Player player2 = new Player("player1", Player.playerType.COMPUTER, 2);
    Battleship battleship = new Battleship(player1, player2);
    battleship.nextTurn();
    java.lang.System.out.print(battleship.wasHit(player1, "A4"));
}
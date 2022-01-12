public void startGame() {
    game = new Model.Game(1);
    player1.writeToClient(("GAME " + (player2.getNickName())));
    player2.writeToClient(("GAME " + (player1.getNickName())));
    player1.writeToClient("TURN");
}
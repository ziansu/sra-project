public void createAndRandomizePlayers(int players) {
    playerArray = new model.Player[players];
    viewController.Turn.playerQuantity = players;
    currentPhase = viewController.Turn.turnPhase.newArmyPhase;
    for (int i = 0; i < players; i++) {
        model.Player newPlayer = new model.Player();
        playerArray[i] = newPlayer;
        java.lang.System.out.println("A new player has been created!");
    }
    currentPlayer = this.playerArray[0];
}
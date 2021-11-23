@javafx.fxml.FXML
private void initialize() {
    StoreScreenController.currentTurn = GridScreenController.turn;
    StoreScreenController.currentPlayer = MuleProject.players.getPlayer(((StoreScreenController.currentTurn.getTurnNumber()) % 4));
    energy.setText(("Current energy: " + (StoreScreenController.currentPlayer.getEnergy())));
    food.setText(("Current food: " + (StoreScreenController.currentPlayer.getFood())));
    cash.setText(("Current cash: " + (StoreScreenController.currentPlayer.getMoney())));
}
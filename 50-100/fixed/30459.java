private void handleNewTrain(java.lang.Object object) {
    java.util.List<java.lang.Object> playerAndTrain = ((java.util.List<java.lang.Object>) (object));
    gamelogic.player.Player player = ((gamelogic.player.Player) (playerAndTrain.get(0)));
    gamelogic.resource.Train train = ((gamelogic.resource.Train) (playerAndTrain.get(1)));
    player.removeTrain(train);
    player.addTrain(train);
}
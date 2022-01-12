private void createGameObjects() {
    player = new OOPDberoepsproduct.TinusDeTierendeTaurus.Player();
    OOPDberoepsproduct.TinusDeTierendeTaurus.Obstacle test = new OOPDberoepsproduct.TinusDeTierendeTaurus.Obstacle(new nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite("src/main/java/OOPDberoepsproduct/TinusDeTierendeTaurus/Media/bull.png"), this);
    addGameObject(test, 0, 0);
    addGameObject(player, (((getGameWidth()) / 2) - (player.getWidth())), 700);
}
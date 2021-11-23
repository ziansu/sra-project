@java.lang.Override
public void handle(com.cardshifter.api.outgoing.NewGameMessage message) {
    gameScreen = new com.cardshifter.gdx.screens.GameScreen(game, client, message, this);
    handlerMap.putAll(gameScreen.getHandlers());
    game.setScreen(gameScreen);
}
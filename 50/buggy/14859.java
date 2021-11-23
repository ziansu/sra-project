@java.lang.Override
public void handle(com.cardshifter.api.outgoing.NewGameMessage message) {
    game.setScreen((gameScreen = new com.cardshifter.gdx.screens.GameScreen(game, client, message, this)));
    handlerMap.putAll(gameScreen.getHandlers());
}
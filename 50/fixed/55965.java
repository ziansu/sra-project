@java.lang.Override
public void init() {
    stage = mainController.prepareGameScreen(assetHelper);
    com.badlogic.gdx.InputMultiplexer inputMultiplexer = new com.badlogic.gdx.InputMultiplexer();
    inputMultiplexer.addProcessor(stage);
    Gdx.input.setInputProcessor(inputMultiplexer);
}
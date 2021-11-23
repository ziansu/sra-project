@java.lang.Override
public void handleInput() {
    if (Gdx.input.isKeyJustPressed(Input.Keys.ANY_KEY)) {
        gameStateManager.pop(this);
        gameStateManager.push(new org.academiadecodigo.bootcamp.bolas.state.PlayingState(gameStateManager));
        dispose();
    }
}
@java.lang.Override
public void render(float delta) {
    batch.begin();
    gameOverSprite.draw(batch);
    batch.end();
    if (Gdx.input.isKeyJustPressed(Keys.SPACE)) {
        game.setScreen(new com.running.game.screens.InstructionsScreen(game));
    }
}
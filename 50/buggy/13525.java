public void pause() {
    Gdx.graphics.setContinuousRendering(false);
    Gdx.graphics.requestRendering();
    game.game.paused = true;
}
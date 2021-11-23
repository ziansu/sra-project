public void render(float delta) {
    level.update(delta);
    if (Gdx.input.isKeyPressed(Keys.ESCAPE)) {
        net.TheGalidor.src.Main.getInstance().setScreen(new net.TheGalidor.src.gamestate.PauseScreen());
    }
    batch.begin();
    batch.disableBlending();
    batch.setProjectionMatrix(level.getCam().combined);
    level.render(batch, delta);
    batch.end();
}
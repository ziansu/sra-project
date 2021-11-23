@java.lang.Override
public void render(float delta) {
    update(delta);
    Gdx.gl.glClearColor(1, 0, 0, 1);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    renderer.render();
    b2dr.render(world, gamecam.combined);
    game.batch.setProjectionMatrix(gamecam.combined);
    hud.stage.draw();
}
@java.lang.Override
public void render(float delta) {
    Gdx.gl.glClearColor(0, 0, 0, 1);
    Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);
    de.themdplays.screens.Play.world.step(TIMESTEP, VELOCITYITERATIONS, POSITIONIITERATIONS);
    batch.setProjectionMatrix(de.themdplays.screens.Play.camera.combined);
    levelRenderer.render(batch, map, true);
    batch.begin();
    player.render(batch, delta);
    batch.end();
    debugRenderer.render(de.themdplays.screens.Play.world, de.themdplays.screens.Play.camera.combined);
    de.themdplays.util.ButtonHandler.backFunc(new de.themdplays.screens.menu.MainMenu());
}
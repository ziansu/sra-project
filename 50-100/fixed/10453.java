@java.lang.Override
public void render(float dt) {
    update(dt);
    Gdx.gl.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    game.batch.setProjectionMatrix(cam.combined);
    rayHandler.setCombinedMatrix(cam);
    if (com.develorain.game.Screens.PlayScreen.DEBUG_MODE)
        b2dr.render(world, cam.combined);
    
    rayHandler.render();
    game.batch.setProjectionMatrix(hud.stage.getCamera().combined);
    hud.stage.draw();
}
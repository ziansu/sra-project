@java.lang.Override
public void render() {
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    r.render();
    c.update();
    batch.begin();
    com.TEAM_NAME.Fructus.RendererUtil.renderDebug(font, batch);
    com.badlogic.gdx.graphics.profiling.GLProfiler.reset();
    com.TEAM_NAME.Fructus.RendererUtil.drawTextures(batch, img1, img2, img3, img4);
    batch.end();
}
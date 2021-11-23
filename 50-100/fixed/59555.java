@java.lang.Override
public void render(float delta) {
    Gdx.gl.glClear(((com.badlogic.gdx.graphics.GL20.GL_COLOR_BUFFER_BIT) | (com.badlogic.gdx.graphics.GL20.GL_DEPTH_BUFFER_BIT)));
    Gdx.gl.glEnable(GL20.GL_DEPTH_TEST);
    float deltaTime = Gdx.graphics.getDeltaTime();
    batch.setProjectionMatrix(camera.combined);
    batch.begin();
    drawBackground();
    batch.end();
    engine.update(deltaTime);
}
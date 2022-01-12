@java.lang.Override
public void update(float deltaTime) {
    _camera.update();
    Gdx.gl.glClearColor(0.42F, 0.43F, 0.45F, 1);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    _batch.begin();
    generateClippingScissors();
    _batch.setProjectionMatrix(_camera.combined);
    super.update(deltaTime);
    com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.popScissors();
    _batch.end();
}
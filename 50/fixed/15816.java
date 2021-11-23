@java.lang.Override
public void update(com.badlogic.gdx.graphics.g2d.SpriteBatch batch) {
    batch.setProjectionMatrix(camera.combined);
}
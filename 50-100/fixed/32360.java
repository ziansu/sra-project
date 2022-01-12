@java.lang.Override
public void create() {
    batch = new com.badlogic.gdx.graphics.g2d.SpriteBatch();
    debugger = new com.badlogic.gdx.graphics.glutils.ShapeRenderer();
    level = new game.Level();
    camera = new com.badlogic.gdx.graphics.OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
    camera.setToOrtho(false);
    Gdx.graphics.setVSync(true);
}
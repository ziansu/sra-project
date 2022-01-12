@java.lang.Override
public void resize(int width, int height) {
    super.resize(width, height);
    com.badlogic.gdx.utils.viewport.Viewport viewport = stage.getViewport();
    viewport.update(width, height);
    com.badlogic.gdx.math.Vector2 zero = new com.badlogic.gdx.math.Vector2(0, (height - 1));
    viewport.unproject(zero);
    overlay.setPosition(zero.x, zero.y);
    overlay.setSize(viewport.getWorldWidth(), viewport.getWorldHeight());
    previousGame.resize(width, height);
}
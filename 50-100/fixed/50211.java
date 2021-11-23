@java.lang.Override
public boolean touchDown(int screenX, int screenY, int pointer, int button) {
    com.badlogic.gdx.math.Vector2 localCoordinates = screenToLocalCoordinates(new com.badlogic.gdx.math.Vector2(screenX, screenY));
    return (hit(localCoordinates.x, localCoordinates.y, isTouchable())) != null;
}
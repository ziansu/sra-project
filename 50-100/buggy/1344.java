@java.lang.Override
public boolean touchUp(int screenX, int screenY, int pointer, int button) {
    com.badlogic.gdx.math.Vector3 coordinates = manager.getScreen().getCamera().unproject(new com.badlogic.gdx.math.Vector3(screenX, screenY, 0));
    stone.getBody().setLinearVelocity(velocity.x, velocity.y);
    return super.touchUp(screenX, screenY, pointer, button);
}
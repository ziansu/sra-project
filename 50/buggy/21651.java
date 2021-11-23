@java.lang.Override
public void reset() {
    stateTime = 0.0F;
    currentFrame = null;
    size = null;
    position = null;
    origin = new com.badlogic.gdx.math.Vector2();
    loader = null;
    defaultDynamicBodyDef = null;
}
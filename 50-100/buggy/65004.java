@java.lang.Override
public boolean touchDown(float x, float y, int pointer, int button) {
    Gdx.app.log("Call function", (((((((("touchDown(" + x) + ", ") + y) + ", ") + pointer) + ", ") + button) + ");"));
    dragNew = new com.badlogic.gdx.math.Vector2(Gdx.input.getX(), Gdx.input.getY());
    dragOld = dragNew;
    return true;
}
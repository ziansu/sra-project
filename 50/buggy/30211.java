@java.lang.Override
public boolean touchDragged(int screenX, int screenY, int pointer) {
    mouseDrag.x = Gdx.input.getDeltaX();
    mouseDrag.y = Gdx.input.getDeltaY();
    return true;
}
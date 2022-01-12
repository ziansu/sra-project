@java.lang.Override
public boolean touchDown(int screenX, int screenY, int pointer, int button) {
    listener.onScreenClick(screenX, screenY);
    return false;
}
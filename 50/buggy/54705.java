@java.lang.Override
public boolean touchDown(int screenX, int screenY, int pointer, int button) {
    touchX = screenX;
    touchY = screenY;
    touchAllowed = environment.isInputAllowed();
    return true;
}
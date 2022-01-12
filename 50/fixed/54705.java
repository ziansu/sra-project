@java.lang.Override
public boolean touchDown(int screenX, int screenY, int pointer, int button) {
    touchAllowed = environment.isInputAllowed();
    touchX = screenX;
    touchY = screenY;
    return true;
}
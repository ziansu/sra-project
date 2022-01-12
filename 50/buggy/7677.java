@java.lang.Override
public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
    if ((keyCode == (android.view.KeyEvent.KEYCODE_VOLUME_DOWN)) || (keyCode == (android.view.KeyEvent.KEYCODE_VOLUME_UP))) {
        return true;
    }
    return false;
}
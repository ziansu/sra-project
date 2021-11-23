@java.lang.Override
public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    if ((event.isAltPressed()) == true) {
        return false;
    }
    return super.onKeyDown(keyCode, event);
}
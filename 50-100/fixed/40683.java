@java.lang.Override
public boolean dispatchKeyEvent(android.view.KeyEvent event) {
    int keyCode = event.getKeyCode();
    android.app.Activity c = getActivity();
    if (keyCode == (android.view.KeyEvent.KEYCODE_BACK)) {
        c.onKeyDown(keyCode, event);
        return true;
    }
    boolean superHandled = super.dispatchKeyEvent(event);
    if (superHandled) {
        return true;
    }
    return c.dispatchKeyEvent(event);
}
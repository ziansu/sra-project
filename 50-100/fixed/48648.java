@java.lang.Override
public boolean dispatchKeyEvent(android.view.KeyEvent e) {
    if (((e.getKeyCode()) == (android.view.KeyEvent.KEYCODE_BACK)) && ((getVisibility()) == (android.view.View.VISIBLE))) {
        hideCircularly(((android.app.Activity) (getContext())));
        return false;
    }
    return super.dispatchKeyEvent(e);
}
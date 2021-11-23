@java.lang.Override
public boolean dispatchKeyEvent(android.view.KeyEvent event) {
    if ((dismissOnBackPress) && ((event.getKeyCode()) == (android.view.KeyEvent.KEYCODE_BACK))) {
        if ((event.getAction()) == (android.view.KeyEvent.ACTION_UP)) {
            dismiss();
        }
        return true;
    }
    return super.dispatchKeyEvent(event);
}
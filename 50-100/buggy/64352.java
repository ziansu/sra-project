@java.lang.Override
public boolean dispatchKeyEvent(android.view.KeyEvent event) {
    if (dismissOnBackPress) {
        if (((event.getAction()) == (android.view.KeyEvent.ACTION_UP)) && ((event.getKeyCode()) == (android.view.KeyEvent.KEYCODE_BACK))) {
            dismiss();
            return true;
        }
    }
    return super.dispatchKeyEvent(event);
}
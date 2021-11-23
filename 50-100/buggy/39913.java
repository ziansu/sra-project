@java.lang.Override
public boolean sendKeyEvent(android.view.KeyEvent event) {
    if (((event.getAction()) == (android.view.KeyEvent.ACTION_DOWN)) && ((event.getKeyCode()) == (android.view.KeyEvent.KEYCODE_DEL))) {
        this.setRandomBackgroundColor();
    }
    return super.sendKeyEvent(event);
}
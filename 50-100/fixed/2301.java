@java.lang.Override
public boolean onKey(android.view.View v, int keyCode, android.view.KeyEvent event) {
    if ((keyCode == (android.view.KeyEvent.KEYCODE_ENTER)) && ((event.getAction()) == (android.view.KeyEvent.ACTION_UP))) {
        jumpPage(v);
        return true;
    }
    return false;
}
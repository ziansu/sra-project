@java.lang.Override
public boolean onKey(android.view.View v, int keyCode, android.view.KeyEvent event) {
    if ((event.getAction()) == (android.view.KeyEvent.ACTION_DOWN)) {
        if (keyCode == (android.view.KeyEvent.KEYCODE_ENTER)) {
            rightGuess();
            return true;
        }
    }
    return false;
}
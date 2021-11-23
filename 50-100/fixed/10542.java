@java.lang.Override
public boolean onKey(android.view.View v, int keyCode, android.view.KeyEvent event) {
    if ((event.getAction()) == (android.view.KeyEvent.ACTION_DOWN)) {
        switch (keyCode) {
            case android.view.KeyEvent.KEYCODE_ENTER :
                rightGuess();
                return true;
            default :
                break;
        }
    }
    return false;
}
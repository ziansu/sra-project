@java.lang.Override
public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    if ((keyCode == (android.view.KeyEvent.KEYCODE_BACK)) && (canGoBack())) {
        goBack();
        return true;
    }
    return super.onKeyDown(keyCode, event);
}
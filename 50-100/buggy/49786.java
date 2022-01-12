@java.lang.Override
public boolean onKey(android.view.View view, int keyCode, android.view.KeyEvent keyEvent) {
    if (((keyEvent.getAction()) == (android.view.KeyEvent.ACTION_DOWN)) && (keyCode == (android.view.KeyEvent.KEYCODE_ENTER))) {
        displayFortune();
        android.view.inputmethod.InputMethodManager in = ((android.view.inputmethod.InputMethodManager) (getSystemService(Context.INPUT_METHOD_SERVICE)));
        in.hideSoftInputFromWindow(mQuestion.getApplicationWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        return true;
    }
    return false;
}
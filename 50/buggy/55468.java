@java.lang.Override
public void hideKeyboard() {
    android.view.inputmethod.InputMethodManager manager = ((android.view.inputmethod.InputMethodManager) (getSystemService(Context.INPUT_METHOD_SERVICE)));
    manager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
}
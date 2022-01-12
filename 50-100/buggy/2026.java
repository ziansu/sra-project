private void hideKeyboard() {
    android.view.View view = this.getCurrentFocus();
    view.clearFocus();
    if (view != null) {
        android.view.inputmethod.InputMethodManager inputManager = ((android.view.inputmethod.InputMethodManager) (this.getSystemService(Context.INPUT_METHOD_SERVICE)));
        inputManager.hideSoftInputFromWindow(view.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
    }
}
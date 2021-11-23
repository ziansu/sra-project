public void clearFocus() {
    android.view.View focusedView = getCurrentFocus();
    if (focusedView != null) {
        focusedView.clearFocus();
    }
    ((android.view.inputmethod.InputMethodManager) (getSystemService(Context.INPUT_METHOD_SERVICE))).hideSoftInputFromWindow(focusedView.getWindowToken(), 0);
}
private void hideKeyboard() {
    android.view.inputmethod.InputMethodManager inputManager = ((android.view.inputmethod.InputMethodManager) (getContext().getSystemService(Context.INPUT_METHOD_SERVICE)));
    android.view.View v = ((android.app.Activity) (getContext())).getCurrentFocus();
    if (v == null)
        return ;
    
    inputManager.hideSoftInputFromWindow(v.getWindowToken(), 0);
}
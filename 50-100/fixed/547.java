@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    onQueryTextChange(query);
    android.view.View view = getCurrentFocus();
    if (view != null) {
        android.view.inputmethod.InputMethodManager imm = ((android.view.inputmethod.InputMethodManager) (getSystemService(Context.INPUT_METHOD_SERVICE)));
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
    return true;
}
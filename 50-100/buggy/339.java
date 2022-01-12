@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String s) {
    android.view.inputmethod.InputMethodManager inputManager = ((android.view.inputmethod.InputMethodManager) (getSystemService(Context.INPUT_METHOD_SERVICE)));
    inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
    searchString = "&q=" + s;
    mImagesUrls.clear();
    if (onImageSearch(0))
        adapter.notifyDataSetChanged();
    
    return true;
}
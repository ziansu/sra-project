@java.lang.Override
public void onLoadFinished(android.content.Loader<java.util.List<com.example.android.booklistingapp.Book>> loader, java.util.List<com.example.android.booklistingapp.Book> books) {
    android.view.inputmethod.InputMethodManager inputManager = ((android.view.inputmethod.InputMethodManager) (getSystemService(Context.INPUT_METHOD_SERVICE)));
    inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
    mAdapter.clear();
    if ((books != null) && (!(books.isEmpty()))) {
        mAdapter.addAll(books);
    }
}
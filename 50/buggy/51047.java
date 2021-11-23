@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    searchRequest = query;
    android.util.Log.i(com.example.camille.booklist.MainActivity.LOG_TAG, "TEST: Setting searchRequest to be the query");
    android.app.LoaderManager loaderManager = getLoaderManager();
    loaderManager.initLoader(com.example.camille.booklist.MainActivity.BOOK_LOADER_ID, null, this);
    return true;
}
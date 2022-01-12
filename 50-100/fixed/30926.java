@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    if (!(isConnected())) {
        android.widget.Toast.makeText(this, getString(R.string.no_internet_connection), Toast.LENGTH_SHORT).show();
        return false;
    }
    userQuery = query.trim();
    loadingIndicator = findViewById(R.id.loading_indicator);
    loadingIndicator.setVisibility(View.VISIBLE);
    loaderManager = getSupportLoaderManager();
    loaderManager.restartLoader(com.divitngoc.android.udacityprojectbooklisting.MainActivity.BOOK_LOADER_ID, null, this);
    return false;
}
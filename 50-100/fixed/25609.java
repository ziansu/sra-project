@java.lang.Override
protected void onNewIntent(android.content.Intent intent) {
    com.stablekernel.photogallery.PhotoGalleryFragment fragment = ((com.stablekernel.photogallery.PhotoGalleryFragment) (getSupportFragmentManager().findFragmentById(R.id.fragmentContainer)));
    if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
        java.lang.String query = intent.getStringExtra(SearchManager.QUERY);
        android.util.Log.i(com.stablekernel.photogallery.PhotoGalleryActivity.TAG, ("Received a new search query: " + query));
        android.preference.PreferenceManager.getDefaultSharedPreferences(this).edit().putString(FlickrFetchr.PREF_SEARCH_QUERY, query).commit();
    }
    fragment.updateItems(0);
}
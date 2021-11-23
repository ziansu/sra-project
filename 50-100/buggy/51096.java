@java.lang.Override
protected void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    java.lang.String action = intent.getAction();
    if ((action.equals(Intent.ACTION_SEARCH)) || (action.equals(com.udacity.moviediary.activity.SearchableActivity.GMS_SEARCH_ACTION))) {
        mQuery = intent.getStringExtra(SearchManager.QUERY);
        if ((mTabIndex) == (com.udacity.moviediary.activity.SearchableActivity.FAVOURITE)) {
            mActivitySearchBinding.progressBar.setVisibility(View.VISIBLE);
            getSupportLoaderManager().initLoader(com.udacity.moviediary.activity.SearchableActivity.MOVIE_SEARCH_LOADER, null, this);
        }else {
            doSearch();
        }
    }
}
@java.lang.Override
protected void onResume() {
    savedSearchString = com.logan19gp.flickrviewer.MainApplication.loadFromPrefs(com.logan19gp.flickrviewer.SearchActivity.SEARCH_STR, "");
    if ((savedSearchString.length()) > 0) {
        pageOnView = com.logan19gp.flickrviewer.MainApplication.loadFromPrefsInt(com.logan19gp.flickrviewer.SearchActivity.PAGE_ON_VIEW, 0);
        showSearchResult();
    }
    super.onResume();
}
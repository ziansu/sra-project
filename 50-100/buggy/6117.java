@java.lang.Override
protected void onResume() {
    savedSearchString = com.logan19gp.flickrviewer.MainApplication.loadFromPrefs(com.logan19gp.flickrviewer.SearchActivity.SEARCH_STR, "");
    if ((savedSearchString.length()) > 0) {
        pageOnView = com.logan19gp.flickrviewer.MainApplication.loadFromPrefsInt(com.logan19gp.flickrviewer.SearchActivity.PAGE_ON_VIEW, 1);
        showSearchResult(savedSearchString, pageOnView, ((pageOnView) * (com.logan19gp.flickrviewer.SearchActivity.PER_PAGE)));
    }
    super.onResume();
}
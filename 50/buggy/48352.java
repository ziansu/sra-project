public void hideSearchView() {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.ICE_CREAM_SANDWICH)) {
        searchMenuItem.collapseActionView();
    }
    wikiViewer.requestFocus();
}
@java.lang.Override
protected void onResume() {
    super.onResume();
    loadItems(BUNDLE_QUERY_REVIEW, getString(mMovie.getId()));
    loadItems(BUNDLE_QUERY_VIDEO, getString(mMovie.getId()));
}
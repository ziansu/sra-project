@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    if ((mSearchView) != null) {
        outState.putString(Constants.Extra.QUERY_STRING, mSearchView.getQuery().toString());
        outState.putBoolean(Constants.Extra.SEARCH_VIEW_HAS_FOCUS, mSearchView.hasFocus());
    }
    if ((mRecyclerView) != null) {
        outState.putParcelable(Constants.Extra.RECYCLER_LAYOUT, mRecyclerView.getLayoutManager().onSaveInstanceState());
    }
    resetAsyncTask(null);
}
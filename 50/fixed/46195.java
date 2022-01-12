@java.lang.Override
public void onLoadFinished(Loader<java.lang.Void> loader, java.lang.Void data) {
    mainActivity.mainFragment.onSearchCompleted(query);
    mainActivity.mainFragment.mSwipeRefreshLayout.setRefreshing(false);
}
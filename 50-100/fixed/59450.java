@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    if (!(android.text.TextUtils.isEmpty(query))) {
        errorView.setVisibility(View.GONE);
        networkHelper.fetchSearchedPhotos(1, query, true);
        swipeRefreshLayout.setRefreshing(true);
        searchOpen = true;
    }
    hideBlurryBg();
    return false;
}
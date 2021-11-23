@java.lang.Override
public void onRefresh() {
    if ((-1) != (mSiteId)) {
        loadNewsList();
    }else {
        showFavorites();
        mSwipeLayout.setRefreshing(false);
    }
}
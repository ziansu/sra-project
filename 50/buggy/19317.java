@java.lang.Override
public void onRefresh() {
    if ((-1) != (mSiteId)) {
        com.jack.newsobserver.util.ImageCache.clearCache();
        loadNewsList();
    }else {
        showFavorites();
        mSwipeLayout.setRefreshing(false);
    }
}
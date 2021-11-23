@java.lang.Override
public void call() {
    activity.supportInvalidateOptionsMenu();
    final android.view.View view = getView();
    if (view != null) {
        cgeo.geocaching.CacheDetailActivity.updateOfflineBox(view, cache, res, new cgeo.geocaching.CachePopupFragment.RefreshCacheClickListener(), new cgeo.geocaching.CachePopupFragment.DropCacheClickListener(), new cgeo.geocaching.CachePopupFragment.StoreCacheClickListener(), null);
        cgeo.geocaching.CacheDetailActivity.updateCacheLists(view, cache, res);
    }
}
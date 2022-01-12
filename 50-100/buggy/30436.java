@java.lang.Override
public void call() {
    activity.supportInvalidateOptionsMenu();
    cgeo.geocaching.CacheDetailActivity.updateOfflineBox(getView(), cache, res, new cgeo.geocaching.CachePopupFragment.RefreshCacheClickListener(), new cgeo.geocaching.CachePopupFragment.DropCacheClickListener(), new cgeo.geocaching.CachePopupFragment.StoreCacheClickListener(), null);
    cgeo.geocaching.CacheDetailActivity.updateCacheLists(getView(), cache, res);
}
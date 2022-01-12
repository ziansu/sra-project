protected boolean isReadCacheData() {
    java.lang.String key = getCacheKey();
    android.app.Activity activity = apollo.tianya.base.BaseListFragment.getActivity();
    if (!(apollo.tianya.util.CompatibleUtil.hasInternet()))
        return true;
    
    if (!(apollo.tianya.cache.CacheManager.isCacheDataFailure(activity, key)))
        return true;
    
    return false;
}
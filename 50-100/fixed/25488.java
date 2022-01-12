private void removeAvailableCachedItems() {
    int maxCachedItems = ((maxCacheAroundCurrent) * 2) + 1;
    boolean cacheAvailable = maxCachedItems < (adapter.getItemsCount());
    if (!cacheAvailable)
        return ;
    
    int previousPosition = (currentPosition) - (maxCacheAroundCurrent);
    int nextPosition = (currentPosition) + (maxCacheAroundCurrent);
    removeCachedViewIfExists(previousPosition);
    removeCachedViewIfExists(nextPosition);
}
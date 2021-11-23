private void removeAvailableCachedItems() {
    int maxCachedItems = ((maxCacheAroundCurrent) * 2) + 1;
    boolean cacheAvailable = maxCachedItems < (adapter.getItemsCount());
    if (!cacheAvailable)
        return ;
    
    int previousPosition = (currentPosition) - maxCachedItems;
    int nextPosition = (currentPosition) + maxCachedItems;
    removeCachedViewIfExists(previousPosition);
    removeCachedViewIfExists(nextPosition);
}
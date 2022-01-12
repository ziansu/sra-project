private void shrinkCacheByRemovingOldestEntries(int newCacheSize) {
    int numberOfElementsToDelete = (1 + (items2LastAccessTimeMap.size())) - newCacheSize;
    java.util.Map<java.lang.Long, java.lang.Integer> lastAccessTimeCache2Item = items2LastAccessTimeMap.inverse();
    lastAccessTimeCache2Item.keySet().stream().sorted().limit(numberOfElementsToDelete).forEach(( lastAccessTime) -> items2LastAccessTimeMap.remove(lastAccessTimeCache2Item.get(lastAccessTime)));
}
public void setSortMode(org.ligi.fast.model.DynamicAppInfoList.SortMode mode) {
    currentSortMode = mode;
    if (mode.equals(org.ligi.fast.model.DynamicAppInfoList.SortMode.ALPHABETICAL)) {
        this.sorter = new org.ligi.fast.model.AppInfoSortByLabelComparator();
    }else
        if (mode.equals(org.ligi.fast.model.DynamicAppInfoList.SortMode.MOST_USED)) {
            this.sorter = new org.ligi.fast.model.AppInfoSortByMostUsedComparator();
        }
    
    sort();
    setQuery(currentQuery);
}
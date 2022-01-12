private jenkins.widgets.HistoryPageFilter<hudson.model.ModelObject> newPage(int maxEntries, java.lang.Long newerThan, java.lang.Long olderThan) {
    jenkins.widgets.HistoryPageFilter<hudson.model.ModelObject> pageFilter = new jenkins.widgets.HistoryPageFilter<hudson.model.ModelObject>(maxEntries);
    if (newerThan != null) {
        pageFilter.setNewerThan(jenkins.widgets.HistoryPageEntry.getEntryId(newerThan));
    }else
        if (olderThan != null) {
            pageFilter.setOlderThan(jenkins.widgets.HistoryPageEntry.getEntryId(olderThan));
        }
    
    return pageFilter;
}
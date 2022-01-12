public jenkins.widgets.HistoryPageFilter getHistoryPageFilter() {
    jenkins.widgets.HistoryPageFilter<T> historyPageFilter = newPageFilter();
    historyPageFilter.add(org.apache.commons.collections.IteratorUtils.toList(baseList.iterator()));
    historyPageFilter.widget = this;
    return historyPageFilter;
}
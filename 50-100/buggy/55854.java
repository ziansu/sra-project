public void onSearchTextChanged(java.lang.String searchPattern) {
    eventListModel.setCurrentSearchPattern(searchPattern);
    eventListModel.resetPageNumber();
    eventListModel.clearEventListDataSet();
    eventListModel.setFilteredStatus(((searchPattern.length()) > 0));
    resetScrollAdapter();
    if ((searchPattern.length()) > 0)
        sendSearchRequest();
    else
        eventListViewInterface.notifyEventAdapterOfDataSetChange();
    
}
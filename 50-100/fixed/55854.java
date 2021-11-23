public void onSearchTextChanged(java.lang.String searchPattern) {
    eventListModel.setCurrentSearchPattern(searchPattern);
    if ((searchPattern.length()) > 0) {
        eventListModel.setFilteredStatus(true);
        eventListModel.resetPageNumber();
        eventListModel.clearEventListDataSet();
        sendSearchRequest();
    }else {
        eventListModel.clearEventListDataSet();
        eventListModel.resetPageNumber();
        eventListModel.setFilteredStatus(false);
        eventListViewInterface.notifyEventAdapterOfDataSetChange();
    }
    resetScrollAdapter();
}
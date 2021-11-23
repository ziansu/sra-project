@java.lang.Override
public void resetData() {
    searchResultPanel.clear();
    resultCountVal = 0;
    lblLoadingText.setVisible(true);
    isApiInProgress = true;
    isApiInProgressBack = true;
    isApiInProgressBackLoad = true;
    isApiInProgressLoad = true;
    pageNumber = 1;
    previousCount = 0;
    pageCountForStorage = 1;
    localStore.clear();
    isForwardScroll = true;
    previousValue = 0;
    pageFlag = false;
}
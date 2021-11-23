public void resetDataBacktoTop() {
    searchResultPanel.clear();
    lblLoadingText.setVisible(false);
    isApiInProgress = true;
    isApiInProgressBack = true;
    isApiInProgressBackLoad = true;
    isApiInProgressLoad = true;
    pageNumber = 1;
    pageCountForStorage = 1;
    pageFlag = false;
    localStore.clear();
    isForwardScroll = true;
    org.ednovo.gooru.client.mvp.gsearch.SearchAbstractView.getUiHandlers().resetLocalStorageData();
    if ((pnlFirstTempData) != null) {
        searchResultPanel.add(pnlFirstTempData);
    }
    org.ednovo.gooru.client.mvp.gsearch.SearchAbstractView.callAnimation();
}
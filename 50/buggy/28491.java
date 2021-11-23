public void silentGoTo(int selector, int tab) {
    executingHistoryAction = true;
    tabSelector.getSelectionModel().select(selector);
    tabs.getSelectionModel().select(tab);
}
private void updateSelectedTab(int newPosition) {
    int newTabId = getTabAtPosition(newPosition).getId();
    if (newPosition != (currentTabPosition)) {
        if ((onTabSelectListener) != null) {
            onTabSelectListener.onTabSelected(newTabId);
        }
    }else
        if (((onTabReselectListener) != null) && (!(ignoreTabReselectionListener))) {
            onTabReselectListener.onTabReSelected(newTabId);
        }
    
    currentTabPosition = newPosition;
    if (ignoreTabReselectionListener) {
        ignoreTabReselectionListener = false;
    }
}
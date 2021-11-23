private void updateSelectedTab(int newPosition) {
    int newTabId = getTabAtPosition(newPosition).getId();
    if ((newPosition != (currentTabPosition)) && ((onTabSelectListener) != null)) {
        currentTabPosition = newPosition;
        onTabSelectListener.onTabSelected(newTabId);
    }else
        if (((onTabReselectListener) != null) && (!(ignoreTabReselectionListener))) {
            onTabReselectListener.onTabReSelected(newTabId);
        }
    
    if (ignoreTabReselectionListener) {
        ignoreTabReselectionListener = false;
    }
}
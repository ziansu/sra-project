private void setSelectedTab(com.bigscreen.iconictabbar.view.IconicTab tab, int tabPosition) {
    selectedTab = tab;
    selectedTabPosition = tabPosition;
    onTabSelectedListener.onSelected(selectedTab, selectedTabPosition);
    selectedTab.setSelected();
}
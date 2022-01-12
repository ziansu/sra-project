@java.lang.Override
public void onTabClick(com.bigscreen.iconictabbar.view.IconicTab tabBottomBar, int position) {
    setUnselectedTab(selectedTab, selectedTabPosition);
    setSelectedTab(tabBottomBar, position);
}
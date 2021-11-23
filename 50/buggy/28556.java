@java.lang.Override
public void onPageSelected(int position) {
    super.onPageSelected(position);
    java.lang.String currentView = ((cm.aptoide.pt.NavigationTrackerPagerAdapterHelper) (getAdapter())).getItemName(position);
    aptoideNavigationTracker.registerView(currentView);
    pageViewAnalytics.sendPageViewedEvent();
}